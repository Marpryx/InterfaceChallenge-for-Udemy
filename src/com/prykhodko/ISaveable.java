package com.prykhodko;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    public List<String> write();
    void read(List<String> savedValues);
}
