package com.service.impl;

import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.converter.CertificateConverter;
import com.dao.CertificateDao;
import com.dto.CertificateDto;
import com.entity.Certificate;
import com.service.CertificateService;



@Service("certificateService")
public class CertificateServiceImpl implements CertificateService{
	
  @Autowired
	private CertificateDao certificateDao;

	@Transactional
	public boolean add(CertificateDto certificateDto) {
		return certificateDao.add(CertificateConverter.toCertificate(certificateDto));
	}
	@Transactional(readOnly = true)
	public boolean existCertificate(String name) {
		return getCertificateByName(name) != null;
	}
	
	@Transactional(readOnly = true)
	public CertificateDto getCertificateByName(String name) {
		Certificate certificate = certificateDao.getCertificateByName(name);
		return certificate == null ? null : CertificateConverter.toCertificateDto(certificate);
	}
	@Transactional
	public boolean edit(CertificateDto certificateDto) {
		return certificateDao.edit(CertificateConverter.toEditCertificate(certificateDto));
	}

	@Transactional
	public boolean delete(int certificateDtoId) {
		return certificateDao.delete(certificateDtoId);
	}

	@Transactional
	public boolean deleteList(List<CertificateDto> certificates) {
		boolean control = false;
		for (CertificateDto certificateDto : certificates) {
			control = certificateDao.delete(certificateDto.getId());
		}

		return control;
	}

	@Transactional(readOnly = true)
	public List<CertificateDto> getCertificates(String description, int idManager) {
	return CertificateConverter.toCertificateListDto(certificateDao.getCertificates(description, idManager));
		
	}

	@Transactional(readOnly = true)
	public CertificateDto getCertificateById(int idCertificate) {
		return CertificateConverter.toCertificateDto(certificateDao.getCertificateById(idCertificate));
	}

	


	@Transactional(readOnly = true)
	public boolean canDeleteCertificate(int idCertificate) {
		return certificateDao.getCertificateById(idCertificate).getCertifications().isEmpty();
	}

	@Transactional(readOnly = true)
	public boolean canDeleteListCertificates(List<CertificateDto> certificates) {
		boolean canDelete = true;
		for (CertificateDto certificate : certificates) {
			if (!canDeleteCertificate(certificate.getId())) {
				canDelete = false;
				break;
			}
		}
		return canDelete;
	}
	
}
