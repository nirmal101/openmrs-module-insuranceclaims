package org.openmrs.module.insuranceclaims.api.dao.impl;

import org.openmrs.api.db.hibernate.HibernateOpenmrsDataDAO;
import org.openmrs.module.insuranceclaims.api.dao.InsuranceClaimDiagnosisDao;
import org.openmrs.module.insuranceclaims.api.model.InsuranceClaimDiagnosis;

public class InsuranceClaimDiagnosisDaoImpl extends HibernateOpenmrsDataDAO<InsuranceClaimDiagnosis>
		implements InsuranceClaimDiagnosisDao {

	public InsuranceClaimDiagnosisDaoImpl() {
		super(InsuranceClaimDiagnosis.class);
	}
}
