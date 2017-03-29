package com.boco.soap.variant.henan.local.gt.lstp.bell;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.boco.soap.check.standvalue.valueinvoke.impl.VariantValueInvoke;
import com.boco.soap.common.pojo.INeElement;
import com.boco.soap.common.pojo.solution.IInstructionParameter;

public class ES extends VariantValueInvoke {

	/*
	 * Editor:Jianwen Sha Edited time:2015-8-11 10:20:21 DESC:锟斤拷取 寻址锟斤拷锟斤拷锟斤拷锟?
	 */
	@Override
	public String[] getValues(INeElement arg0, IInstructionParameter arg1,
			Map<String, ?> data, String dbFile) {

		String o = data.get("HLR_NAME").toString();
		String result = "";
		if (null == o) {
			result = "[NULL]";
		} else {
			String hlrName = o.toString();
			Pattern p = Pattern.compile("^\\s*(\\w+)[\\s+|,|，|、]");
			Matcher m = p.matcher(hlrName);
			if (m.find()) {
				result = m.group(1);
			} else {
				result = hlrName;
			}
		}
		return new String[] { result };

	}

}
