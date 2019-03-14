package com.sfdc.fields.wrappers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecordTypeInfo {

    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("defaultRecordTypeMapping")
    @Expose
    private Boolean defaultRecordTypeMapping;
    @SerializedName("developerName")
    @Expose
    private String developerName;
    @SerializedName("master")
    @Expose
    private Boolean master;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("recordTypeId")
    @Expose
    private String recordTypeId;
    @SerializedName("urls")
    @Expose
    private Urls urls;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getDefaultRecordTypeMapping() {
        return defaultRecordTypeMapping;
    }

    public void setDefaultRecordTypeMapping(Boolean defaultRecordTypeMapping) {
        this.defaultRecordTypeMapping = defaultRecordTypeMapping;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public Boolean getMaster() {
        return master;
    }

    public void setMaster(Boolean master) {
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecordTypeId() {
        return recordTypeId;
    }

    public void setRecordTypeId(String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecordTypeInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("available");
        sb.append('=');
        sb.append(((this.available == null)?"<null>":this.available));
        sb.append(',');
        sb.append("defaultRecordTypeMapping");
        sb.append('=');
        sb.append(((this.defaultRecordTypeMapping == null)?"<null>":this.defaultRecordTypeMapping));
        sb.append(',');
        sb.append("developerName");
        sb.append('=');
        sb.append(((this.developerName == null)?"<null>":this.developerName));
        sb.append(',');
        sb.append("master");
        sb.append('=');
        sb.append(((this.master == null)?"<null>":this.master));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("recordTypeId");
        sb.append('=');
        sb.append(((this.recordTypeId == null)?"<null>":this.recordTypeId));
        sb.append(',');
        sb.append("urls");
        sb.append('=');
        sb.append(((this.urls == null)?"<null>":this.urls));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.defaultRecordTypeMapping == null)? 0 :this.defaultRecordTypeMapping.hashCode()));
        result = ((result* 31)+((this.urls == null)? 0 :this.urls.hashCode()));
        result = ((result* 31)+((this.recordTypeId == null)? 0 :this.recordTypeId.hashCode()));
        result = ((result* 31)+((this.available == null)? 0 :this.available.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.developerName == null)? 0 :this.developerName.hashCode()));
        result = ((result* 31)+((this.master == null)? 0 :this.master.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecordTypeInfo) == false) {
            return false;
        }
        RecordTypeInfo rhs = ((RecordTypeInfo) other);
        return (((((((((this.defaultRecordTypeMapping == rhs.defaultRecordTypeMapping)||((this.defaultRecordTypeMapping!= null)&&this.defaultRecordTypeMapping.equals(rhs.defaultRecordTypeMapping)))&&((this.urls == rhs.urls)||((this.urls!= null)&&this.urls.equals(rhs.urls))))&&((this.recordTypeId == rhs.recordTypeId)||((this.recordTypeId!= null)&&this.recordTypeId.equals(rhs.recordTypeId))))&&((this.available == rhs.available)||((this.available!= null)&&this.available.equals(rhs.available))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.developerName == rhs.developerName)||((this.developerName!= null)&&this.developerName.equals(rhs.developerName))))&&((this.master == rhs.master)||((this.master!= null)&&this.master.equals(rhs.master))));
    }

}
