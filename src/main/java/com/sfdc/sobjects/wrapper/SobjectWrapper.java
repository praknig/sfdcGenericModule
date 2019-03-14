package com.sfdc.sobjects.wrapper;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SobjectWrapper {

    @SerializedName("encoding")
    @Expose
    private String encoding;
    @SerializedName("maxBatchSize")
    @Expose
    private Integer maxBatchSize;
    @SerializedName("sobjects")
    @Expose
    private List<Sobject> sobjects = new ArrayList<Sobject>();

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public Integer getMaxBatchSize() {
        return maxBatchSize;
    }

    public void setMaxBatchSize(Integer maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
    }

    public List<Sobject> getSobjects() {
        return sobjects;
    }

    public void setSobjects(List<Sobject> sobjects) {
        this.sobjects = sobjects;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SobjectWrapper.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("encoding");
        sb.append('=');
        sb.append(((this.encoding == null)?"<null>":this.encoding));
        sb.append(',');
        sb.append("maxBatchSize");
        sb.append('=');
        sb.append(((this.maxBatchSize == null)?"<null>":this.maxBatchSize));
        sb.append(',');
        sb.append("sobjects");
        sb.append('=');
        sb.append(((this.sobjects == null)?"<null>":this.sobjects));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    

   

}
