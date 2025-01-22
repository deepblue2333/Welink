package com.welink.job;

import com.welink.api.Event;
import com.welink.api.EventCollector;
import com.welink.api.EventWindow;
import com.welink.api.GroupingStrategy;
import com.welink.api.WindowOperator;

class TestWindowedAnalyzer extends WindowOperator {
  private int instance;

  public TestWindowedAnalyzer(String name, int parallelism, GroupingStrategy grouping) {
    super(name, parallelism, grouping);
  }

  @Override
  public void setupInstance(int instance) {
    this.instance = instance;
  }

  @Override
  public void apply(EventWindow window, EventCollector eventCollector) {
    Logger.log(String.format("%d transactions are received between %d and %d\n",
        window.getEvents().size(), window.getStartTime(), window.getEndTime()));
    for (Event event: window.getEvents()) {
      Logger.log(String.format("Event: %s\n", event));
    }
  }
}
