package com.welink.job;

import com.welink.api.Event;
import com.welink.api.FieldsGrouping;

class VehicleTypeFieldsGrouping implements FieldsGrouping {
  private static final long serialVersionUID = -1432651705385964857L;

  public Object getKey(Event event) {
    VehicleEvent e = (VehicleEvent) event;
    return e.getType();
  }
}
