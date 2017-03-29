/*
 * Copyright 2014 BOCO Inter-Telecom (xi'an).
 * All rights reserved.
 * project name: variant_sichuan
 * version V1.0
 * -------------------------------------------
 * author: lijixin
 * date: 2014-10-31
 * note:
 */
package com.boco.soap.variant.henan.local.gt.mscserver.hw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.boco.soap.check.standvalue.valueinvoke.impl.DataQueryUtils;
import com.boco.soap.check.standvalue.valueinvoke.impl.VariantValueInvoke;
import com.boco.soap.common.pojo.INeElement;
import com.boco.soap.common.pojo.solution.IInstructionParameter;
import com.boco.soap.variant.common.SPC16;

/**
 *
 *
 *
 *
 */
public class SPC3 extends VariantValueInvoke {
    private Map<String, String> map = null;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.boco.soap.check.standvalue.valueinvoke.IValueInvoke#getValues(com
     * .boco.soap.common.pojo.INeElement,
     * com.boco.soap.common.pojo.solution.IInstructionParameter, java.util.Map,
     * java.lang.String)
     */
    @Override
    public String[] getValues(INeElement arg0, IInstructionParameter arg1, Map<String, ?> data, String dbFile) {
        String busiStr = arg0.getPhysicalAddr();
        /*if (busiStr.contains("商丘"))
        	return new String[] { "" };*/
        if (this.map == null) {
            this.map = new HashMap<String, String>();
            this.initMap(dbFile);
        }
        if (!busiStr.equals("")) {
            String result1 = null;
            if (this.map.get(busiStr) != null) {
                String[] spcArr = this.map.get(busiStr).split(",");
                String spcStr = spcArr[new Random().nextInt(spcArr.length)];
                result1 = SPC16.spc10to16(spcStr);
            }
            if ((result1 != null) && !result1.equals("")) {
                return new String[] { result1 };
            } else {
                return new String[] { "[NULL]" };
            }

        } else {

            return new String[] { "[NULL]" };
        }

    }

    private void initMap(String dbFile) {
        DataQueryUtils utils = DataQueryUtils.getInstance();
        String sql = "select COVER_CITY,STP1_SPC||','||STP2_SPC SPC from TCM_LOCAL_LSTP ";
        List<Map<String, ?>> resultList = utils.getLocalData(sql, dbFile);

        for (Map<String, ?> temp : resultList) {
            this.map.put(temp.get("COVER_CITY").toString(), temp.get("SPC").toString());

        }
    }

}
