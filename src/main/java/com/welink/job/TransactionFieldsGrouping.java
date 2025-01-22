package com.welink.job;

import com.welink.api.Event;
import com.welink.api.FieldsGrouping;

class TransactionFieldsGrouping implements FieldsGrouping {
  private static final long serialVersionUID = 2392789329942799704L;

  public Object getKey(Event event) {
    TransactionScoreEvent e = (TransactionScoreEvent) event;
    return e.transaction.transactionId;
  }
}
