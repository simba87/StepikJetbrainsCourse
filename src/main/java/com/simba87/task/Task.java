package com.simba87.task;

import java.util.List;

public interface Task {

    List<String> execute();
    List<String> getExpected();
}
