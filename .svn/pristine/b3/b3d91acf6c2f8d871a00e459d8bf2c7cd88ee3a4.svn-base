package com.boco.soap.variant.henan.local.cs.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boco.soap.check.standvalue.valueinvoke.impl.DataQueryUtils;
import com.boco.soap.check.standvalue.valueinvoke.impl.VariantValueInvoke;
import com.boco.soap.common.pojo.INeElement;
import com.boco.soap.common.pojo.solution.IInstructionParameter;


/**
 * ��Ϊ�˾ֺ����ֹ�
 * 
 * @author
 * @Email
 * 
 */
public class CSCNameBy171NE extends VariantValueInvoke {
	private Map<String, String> map=null;
	private Map<String, String> citymap=null;
	
	@Override
	public String[] getValues(INeElement arg0, IInstructionParameter arg1,
			Map<String, ?> data, String dbFile) {
		if (map == null) {
			map = new HashMap<String, String>();
			this.initMap(dbFile,arg0.getName());
		}
		
		
		String sCscname = citymap.get(arg0.getName()) ;

		return sCscname.split(",");
	}
	

	private void initMap(String dbFile,String sName) {
		DataQueryUtils utils = DataQueryUtils.getInstance();
		String sql = "select DEVICENAME,CSCNAME from HW_GMSS_CLDPREANA where DEVICENAME='"+sName+"' and PFX='171'";
		List<Map<String, ?>> resultList = utils.getLocalData(sql, dbFile);
		String sCscname="";
		for (Map<String, ?> temp : resultList) {
			sCscname+=","+temp.get("CSCNAME").toString();
		}
		if(sCscname!="")
		map.put(sName, sCscname.substring(1));
	}
}