package com.boco.soap.variant.henan.local.lte.pgw.hw.volte;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.boco.soap.check.standvalue.valueinvoke.impl.DataQueryUtils;
import com.boco.soap.check.standvalue.valueinvoke.impl.VariantValueInvoke;
import com.boco.soap.common.pojo.INeElement;
import com.boco.soap.common.pojo.solution.IInstructionParameter;

public class REACTIVATION_REQUESTED_DELETE extends VariantValueInvoke {

	public String paramVue="";
	@Override
	
	public String[] getValues(INeElement arg0, IInstructionParameter arg1, Map<String, ?> data, String arg3) {
		
		if (StringUtils.isEmpty(paramVue)) {
			initStr(arg3);
		}

		return new String[] { paramVue };
	}
	
	private void initStr(String dbFile) {
		DataQueryUtils utils = DataQueryUtils.getInstance();
		String sql = "SELECT t.PARAM_VALUE FROM TCM_ALL_VOLTEPARAM   t WHERE  t.ne_type='PGW' AND t.VENDOR_NAME='华为' AND t.ACT_TBNAME='apn-ims' AND t.param_name='reactivation requested delete功能'";
		List<Map<String, ?>> resultList = utils.getLocalData(sql, dbFile);

		for (Map<String, ?> temp : resultList) {
			paramVue=temp.get("PARAM_VALUE").toString();
		}
	}
}
