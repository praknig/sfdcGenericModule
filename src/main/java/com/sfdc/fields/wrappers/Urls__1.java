package com.sfdc.fields.wrappers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Urls__1 {

    @SerializedName("compactLayouts")
    @Expose
    private String compactLayouts;
    @SerializedName("rowTemplate")
    @Expose
    private String rowTemplate;
    @SerializedName("approvalLayouts")
    @Expose
    private String approvalLayouts;
    @SerializedName("uiDetailTemplate")
    @Expose
    private String uiDetailTemplate;
    @SerializedName("uiEditTemplate")
    @Expose
    private String uiEditTemplate;
    @SerializedName("defaultValues")
    @Expose
    private String defaultValues;
    @SerializedName("listviews")
    @Expose
    private String listviews;
    @SerializedName("describe")
    @Expose
    private String describe;
    @SerializedName("uiNewRecord")
    @Expose
    private String uiNewRecord;
    @SerializedName("quickActions")
    @Expose
    private String quickActions;
    @SerializedName("layouts")
    @Expose
    private String layouts;
    @SerializedName("sobject")
    @Expose
    private String sobject;

    public String getCompactLayouts() {
        return compactLayouts;
    }

    public void setCompactLayouts(String compactLayouts) {
        this.compactLayouts = compactLayouts;
    }

    public String getRowTemplate() {
        return rowTemplate;
    }

    public void setRowTemplate(String rowTemplate) {
        this.rowTemplate = rowTemplate;
    }

    public String getApprovalLayouts() {
        return approvalLayouts;
    }

    public void setApprovalLayouts(String approvalLayouts) {
        this.approvalLayouts = approvalLayouts;
    }

    public String getUiDetailTemplate() {
        return uiDetailTemplate;
    }

    public void setUiDetailTemplate(String uiDetailTemplate) {
        this.uiDetailTemplate = uiDetailTemplate;
    }

    public String getUiEditTemplate() {
        return uiEditTemplate;
    }

    public void setUiEditTemplate(String uiEditTemplate) {
        this.uiEditTemplate = uiEditTemplate;
    }

    public String getDefaultValues() {
        return defaultValues;
    }

    public void setDefaultValues(String defaultValues) {
        this.defaultValues = defaultValues;
    }

    public String getListviews() {
        return listviews;
    }

    public void setListviews(String listviews) {
        this.listviews = listviews;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getUiNewRecord() {
        return uiNewRecord;
    }

    public void setUiNewRecord(String uiNewRecord) {
        this.uiNewRecord = uiNewRecord;
    }

    public String getQuickActions() {
        return quickActions;
    }

    public void setQuickActions(String quickActions) {
        this.quickActions = quickActions;
    }

    public String getLayouts() {
        return layouts;
    }

    public void setLayouts(String layouts) {
        this.layouts = layouts;
    }

    public String getSobject() {
        return sobject;
    }

    public void setSobject(String sobject) {
        this.sobject = sobject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Urls__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("compactLayouts");
        sb.append('=');
        sb.append(((this.compactLayouts == null)?"<null>":this.compactLayouts));
        sb.append(',');
        sb.append("rowTemplate");
        sb.append('=');
        sb.append(((this.rowTemplate == null)?"<null>":this.rowTemplate));
        sb.append(',');
        sb.append("approvalLayouts");
        sb.append('=');
        sb.append(((this.approvalLayouts == null)?"<null>":this.approvalLayouts));
        sb.append(',');
        sb.append("uiDetailTemplate");
        sb.append('=');
        sb.append(((this.uiDetailTemplate == null)?"<null>":this.uiDetailTemplate));
        sb.append(',');
        sb.append("uiEditTemplate");
        sb.append('=');
        sb.append(((this.uiEditTemplate == null)?"<null>":this.uiEditTemplate));
        sb.append(',');
        sb.append("defaultValues");
        sb.append('=');
        sb.append(((this.defaultValues == null)?"<null>":this.defaultValues));
        sb.append(',');
        sb.append("listviews");
        sb.append('=');
        sb.append(((this.listviews == null)?"<null>":this.listviews));
        sb.append(',');
        sb.append("describe");
        sb.append('=');
        sb.append(((this.describe == null)?"<null>":this.describe));
        sb.append(',');
        sb.append("uiNewRecord");
        sb.append('=');
        sb.append(((this.uiNewRecord == null)?"<null>":this.uiNewRecord));
        sb.append(',');
        sb.append("quickActions");
        sb.append('=');
        sb.append(((this.quickActions == null)?"<null>":this.quickActions));
        sb.append(',');
        sb.append("layouts");
        sb.append('=');
        sb.append(((this.layouts == null)?"<null>":this.layouts));
        sb.append(',');
        sb.append("sobject");
        sb.append('=');
        sb.append(((this.sobject == null)?"<null>":this.sobject));
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
        result = ((result* 31)+((this.rowTemplate == null)? 0 :this.rowTemplate.hashCode()));
        result = ((result* 31)+((this.approvalLayouts == null)? 0 :this.approvalLayouts.hashCode()));
        result = ((result* 31)+((this.uiDetailTemplate == null)? 0 :this.uiDetailTemplate.hashCode()));
        result = ((result* 31)+((this.quickActions == null)? 0 :this.quickActions.hashCode()));
        result = ((result* 31)+((this.layouts == null)? 0 :this.layouts.hashCode()));
        result = ((result* 31)+((this.compactLayouts == null)? 0 :this.compactLayouts.hashCode()));
        result = ((result* 31)+((this.uiEditTemplate == null)? 0 :this.uiEditTemplate.hashCode()));
        result = ((result* 31)+((this.defaultValues == null)? 0 :this.defaultValues.hashCode()));
        result = ((result* 31)+((this.listviews == null)? 0 :this.listviews.hashCode()));
        result = ((result* 31)+((this.describe == null)? 0 :this.describe.hashCode()));
        result = ((result* 31)+((this.uiNewRecord == null)? 0 :this.uiNewRecord.hashCode()));
        result = ((result* 31)+((this.sobject == null)? 0 :this.sobject.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Urls__1) == false) {
            return false;
        }
        Urls__1 rhs = ((Urls__1) other);
        return (((((((((((((this.rowTemplate == rhs.rowTemplate)||((this.rowTemplate!= null)&&this.rowTemplate.equals(rhs.rowTemplate)))&&((this.approvalLayouts == rhs.approvalLayouts)||((this.approvalLayouts!= null)&&this.approvalLayouts.equals(rhs.approvalLayouts))))&&((this.uiDetailTemplate == rhs.uiDetailTemplate)||((this.uiDetailTemplate!= null)&&this.uiDetailTemplate.equals(rhs.uiDetailTemplate))))&&((this.quickActions == rhs.quickActions)||((this.quickActions!= null)&&this.quickActions.equals(rhs.quickActions))))&&((this.layouts == rhs.layouts)||((this.layouts!= null)&&this.layouts.equals(rhs.layouts))))&&((this.compactLayouts == rhs.compactLayouts)||((this.compactLayouts!= null)&&this.compactLayouts.equals(rhs.compactLayouts))))&&((this.uiEditTemplate == rhs.uiEditTemplate)||((this.uiEditTemplate!= null)&&this.uiEditTemplate.equals(rhs.uiEditTemplate))))&&((this.defaultValues == rhs.defaultValues)||((this.defaultValues!= null)&&this.defaultValues.equals(rhs.defaultValues))))&&((this.listviews == rhs.listviews)||((this.listviews!= null)&&this.listviews.equals(rhs.listviews))))&&((this.describe == rhs.describe)||((this.describe!= null)&&this.describe.equals(rhs.describe))))&&((this.uiNewRecord == rhs.uiNewRecord)||((this.uiNewRecord!= null)&&this.uiNewRecord.equals(rhs.uiNewRecord))))&&((this.sobject == rhs.sobject)||((this.sobject!= null)&&this.sobject.equals(rhs.sobject))));
    }

}
