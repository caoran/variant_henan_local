package com.boco.soap.match.constraintmatch;

import com.boco.soap.common.pojo.INeElement;
import java.util.List;
import java.util.Map;

public abstract interface IConstraintMatch
{
  public abstract List<Map<String, String>> match(INeElement paramINeElement, List<Map<String, String>> paramList);
}