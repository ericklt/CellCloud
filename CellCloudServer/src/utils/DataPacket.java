package utils;

import java.util.ArrayList;

/**
 * Created by ErickLima on 25/06/2017.
 */

public class DataPacket {

    private String processType;
    private ArrayList<Tuple<Long>> data;
    
    public DataPacket(String processType, ArrayList<Tuple<Long>> data) {
		this.processType = processType;
		this.data = data;
	}

    public void setData(ArrayList<Tuple<Long>> data) {
        this.data = data;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public ArrayList<Tuple<Long>> getData() {
        return data;
    }

    public String getProcessType() {
        return processType;
    }
}
