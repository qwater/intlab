package com.zju.catcher.entity.z1;

import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;

public class PatientInfo {

	private long DOCTADVISENO;
	private Date REQUESTTIME;
	private String REQUESTER;
	private Date EXECUTETIME;
	private String EXECUTOR;
	private Date RECEIVETIME;
	private String RECEIVER;
	private int STAYHOSPITALMODE;
	private String PATIENTID;
	private int RESULTSTATUS;
	private int INFANTFLAG;
	private String SECTION;
	private String DEPART_BED;
	private String PATIENTNAME;
	private int SEX;
	private Date BIRTHDAY;
	private String DIAGNOSTIC;
	private char SAMPLETYPE;
	private String EXAMINAIM;
	private int REQUESTMODE;
	private String SAMPLENO;
	private String CHECKOPERATOR;
	private String CHECKEROPINION;
	private Date CHECKTIME;
	private String LABDEPARTMENT;
	private int ISPRINT;
	private String CHKOPER2;
	private String PRINTTIME;
	private String YLXH;
	private String BLH;
	private int CYCLE;
	private Date SENDTIME;
	private Date KSRECEIVETIME;

	// private Date EDITTIME;

	public long getDOCTADVISENO() {
		return DOCTADVISENO;
	}

	public void setDOCTADVISENO(long dOCTADVISENO) {
		DOCTADVISENO = dOCTADVISENO;
	}

	public Date getREQUESTTIME() {
		return REQUESTTIME;
	}

	public void setREQUESTTIME(Date rEQUESTTIME) {
		REQUESTTIME = rEQUESTTIME;
	}

	public String getREQUESTER() {
		return REQUESTER;
	}

	public void setREQUESTER(String rEQUESTER) {
		REQUESTER = rEQUESTER;
	}

	public Date getEXECUTETIME() {
		return EXECUTETIME;
	}

	public void setEXECUTETIME(Date eXECUTETIME) {
		EXECUTETIME = eXECUTETIME;
	}

	public String getEXECUTOR() {
		return EXECUTOR;
	}

	public void setEXECUTOR(String eXECUTOR) {
		EXECUTOR = eXECUTOR;
	}

	public Date getRECEIVETIME() {
		return RECEIVETIME;
	}

	public void setRECEIVETIME(Date rECEIVETIME) {
		RECEIVETIME = rECEIVETIME;
	}

	public String getRECEIVER() {
		return RECEIVER;
	}

	public void setRECEIVER(String rECEIVER) {
		RECEIVER = rECEIVER;
	}

	public int getSTAYHOSPITALMODE() {
		return STAYHOSPITALMODE;
	}

	public void setSTAYHOSPITALMODE(int sTAYHOSPITALMODE) {
		STAYHOSPITALMODE = sTAYHOSPITALMODE;
	}

	public String getPATIENTID() {
		return PATIENTID;
	}

	public void setPATIENTID(String pATIENTID) {
		PATIENTID = pATIENTID;
	}

	public int getINFANTFLAG() {
		return INFANTFLAG;
	}

	public void setINFANTFLAG(int iNFANTFLAG) {
		INFANTFLAG = iNFANTFLAG;
	}

	public String getSECTION() {
		return SECTION;
	}

	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}

	public String getDEPART_BED() {
		return DEPART_BED;
	}

	public void setDEPART_BED(String dEPART_BED) {
		DEPART_BED = dEPART_BED;
	}

	public String getPATIENTNAME() {
		return PATIENTNAME;
	}

	public void setPATIENTNAME(String pATIENTNAME) {
		PATIENTNAME = pATIENTNAME;
	}

	public int getSEX() {
		return SEX;
	}

	public void setSEX(int sEX) {
		SEX = sEX;
	}

	public Date getBIRTHDAY() {
		return BIRTHDAY;
	}

	public void setBIRTHDAY(Date bIRTHDAY) {
		BIRTHDAY = bIRTHDAY;
	}

	public String getDIAGNOSTIC() {
		return DIAGNOSTIC;
	}

	public void setDIAGNOSTIC(String dIAGNOSTIC) {
		DIAGNOSTIC = dIAGNOSTIC;
	}

	public char getSAMPLETYPE() {
		return SAMPLETYPE;
	}

	public void setSAMPLETYPE(char sAMPLETYPE) {
		SAMPLETYPE = sAMPLETYPE;
	}

	public String getEXAMINAIM() {
		return EXAMINAIM;
	}

	public void setEXAMINAIM(String eXAMINAIM) {
		EXAMINAIM = eXAMINAIM;
	}
	
	public int getREQUESTMODE() {
		return REQUESTMODE;
	}

	public void setREQUESTMODE(int rEQUESTMODE) {
		REQUESTMODE = rEQUESTMODE;
	}

	public String getSAMPLENO() {
		return SAMPLENO;
	}

	public void setSAMPLENO(String sAMPLENO) {
		SAMPLENO = sAMPLENO;
	}

	public String getCHECKOPERATOR() {
		return CHECKOPERATOR;
	}

	public void setCHECKOPERATOR(String cHECKOPERATOR) {
		CHECKOPERATOR = cHECKOPERATOR;
	}

	public String getCHECKEROPINION() {
		return CHECKEROPINION;
	}

	public void setCHECKEROPINION(String cHECKEROPINION) {
		CHECKEROPINION = cHECKEROPINION;
	}

	public Date getCHECKTIME() {
		return CHECKTIME;
	}

	public void setCHECKTIME(Date cHECKTIME) {
		CHECKTIME = cHECKTIME;
	}

	public String getLABDEPARTMENT() {
		return LABDEPARTMENT;
	}

	public void setLABDEPARTMENT(String lABDEPARTMENT) {
		LABDEPARTMENT = lABDEPARTMENT;
	}

	public int getISPRINT() {
		return ISPRINT;
	}

	public void setISPRINT(int iSPRINT) {
		ISPRINT = iSPRINT;
	}

	public String getCHKOPER2() {
		return CHKOPER2;
	}

	public void setCHKOPER2(String cHKOPER2) {
		CHKOPER2 = cHKOPER2;
	}

	public String getPRINTTIME() {
		return PRINTTIME;
	}

	public void setPRINTTIME(String pRINTTIME) {
		PRINTTIME = pRINTTIME;
	}

	public int getRESULTSTATUS() {
		return RESULTSTATUS;
	}

	public void setRESULTSTATUS(int rESULTSTATUS) {
		RESULTSTATUS = rESULTSTATUS;
	}

	public String getYLXH() {
		return YLXH;
	}

	public void setYLXH(String yLXH) {
		YLXH = yLXH;
	}

	public String getBLH() {
		return BLH;
	}

	public void setBLH(String bLH) {
		BLH = bLH;
	}

	public int getCYCLE() {
		return CYCLE;
	}

	public void setCYCLE(int cYCLE) {
		CYCLE = cYCLE;
	}
	
	public int getAge() {
		if (BIRTHDAY != null) {
			Calendar now = Calendar.getInstance();
			Calendar previous = Calendar.getInstance();
			previous.setTime(BIRTHDAY);
			return now.get(Calendar.YEAR) - previous.get(Calendar.YEAR);
		}
		return 0;
	}
	
	public Date getSENDTIME() {
		return SENDTIME;
	}

	public void setSENDTIME(Date sENDTIME) {
		SENDTIME = sENDTIME;
	}

	public Date getKSRECEIVETIME() {
		return KSRECEIVETIME;
	}

	public void setKSRECEIVETIME(Date kSRECEIVETIME) {
		KSRECEIVETIME = kSRECEIVETIME;
	}

	/*
	 * public Date getEDITTIME() { return EDITTIME; }
	 * 
	 * public void setEDITTIME(Date eDITTIME) { EDITTIME = eDITTIME; }
	 */
	
	@Override
	public String toString() {

		Field[] fields = this.getClass().getDeclaredFields();
		StringBuilder builder = new StringBuilder();

		for (Field field : fields) {

			try {
				builder.append(field.get(this));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			builder.append(',');
		}

		return builder.toString();
	}

}
