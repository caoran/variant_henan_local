package com.boco.soap.variant.henan.local.cs.common;

import java.util.Map;

import com.boco.soap.check.standvalue.valueinvoke.impl.VariantValueInvoke;
import com.boco.soap.common.pojo.INeElement;
import com.boco.soap.common.pojo.solution.IInstructionParameter;

/**
 * 
 * @author wanghao
 * @Email
 * 
 */

public class GTADDNO134 extends VariantValueInvoke {

	@Override
	public String[] getValues(INeElement arg0, IInstructionParameter arg1,
			Map<String, ?> data, String arg3) {

		Object o = data.get("START_GT");
		String result = null;
		if (null == o) {
			result = "[NULL]";
		} else {
			result = o.toString().trim();

		}
		if (o.toString().trim().equals("134"))
			return "1340,1341,1342,1343,1344,1345,1346,1347,1348".split(",");
		else
			return new String[] { result };

	}

}