package com.sfdc.sobjects.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Urls {

    @SerializedName("rowTemplate")
    @Expose
    private String rowTemplate;
    @SerializedName("defaultValues")
    @Expose
    private String defaultValues;
    @SerializedName("describe")
    @Expose
    private String describe;
    @SerializedName("sobject")
    @Expose
    private String sobject;
    @SerializedName("compactLayouts")
    @Expose
    private String compactLayouts;
    @SerializedName("approvalLayouts")
    @Expose
    private String approvalLayouts;
    @SerializedName("listviews")
    @Expose
    private String listviews;
    @SerializedName("quickActions")
    @Expose
    private String quickActions;
    @SerializedName("layouts")
    @Expose
    private String layouts;
    @SerializedName("eventSchema")
    @Expose
    private String eventSchema;
    @SerializedName("caseArticleSuggestions")
    @Expose
    private String caseArticleSuggestions;
    @SerializedName("caseRowArticleSuggestions")
    @Expose
    private String caseRowArticleSuggestions;
    @SerializedName("push")
    @Expose
    private String push;
    @SerializedName("namedLayouts")
    @Expose
    private String namedLayouts;
    @SerializedName("passwordUtilities")
    @Expose
    private String passwordUtilities;

    public String getRowTemplate() {
        return rowTemplate;
    }

    public void setRowTemplate(String rowTemplate) {
        this.rowTemplate = rowTemplate;
    }

    public String getDefaultValues() {
        return defaultValues;
    }

    public void setDefaultValues(String defaultValues) {
        this.defaultValues = defaultValues;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getSobject() {
        return sobject;
    }

    public void setSobject(String sobject) {
        this.sobject = sobject;
    }

    public String getCompactLayouts() {
        return compactLayouts;
    }

    public void setCompactLayouts(String compactLayouts) {
        this.compactLayouts = compactLayouts;
    }

    public String getApprovalLayouts() {
        return approvalLayouts;
    }

    public void setApprovalLayouts(String approvalLayouts) {
        this.approvalLayouts = approvalLayouts;
    }

    public String getListviews() {
        return listviews;
    }

    public void setListviews(String listviews) {
        this.listviews = listviews;
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

    public String getEventSchema() {
        return eventSchema;
    }

    public void setEventSchema(String eventSchema) {
        this.eventSchema = eventSchema;
    }

    public String getCaseArticleSuggestions() {
        return caseArticleSuggestions;
    }

    public void setCaseArticleSuggestions(String caseArticleSuggestions) {
        this.caseArticleSuggestions = caseArticleSuggestions;
    }

    public String getCaseRowArticleSuggestions() {
        return caseRowArticleSuggestions;
    }

    public void setCaseRowArticleSuggestions(String caseRowArticleSuggestions) {
        this.caseRowArticleSuggestions = caseRowArticleSuggestions;
    }

    public String getPush() {
        return push;
    }

    public void setPush(String push) {
        this.push = push;
    }

    public String getNamedLayouts() {
        return namedLayouts;
    }

    public void setNamedLayouts(String namedLayouts) {
        this.namedLayouts = namedLayouts;
    }

    public String getPasswordUtilities() {
        return passwordUtilities;
    }

    public void setPasswordUtilities(String passwordUtilities) {
        this.passwordUtilities = passwordUtilities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Urls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rowTemplate");
        sb.append('=');
        sb.append(((this.rowTemplate == null)?"<null>":this.rowTemplate));
        sb.append(',');
        sb.append("defaultValues");
        sb.append('=');
        sb.append(((this.defaultValues == null)?"<null>":this.defaultValues));
        sb.append(',');
        sb.append("describe");
        sb.append('=');
        sb.append(((this.describe == null)?"<null>":this.describe));
        sb.append(',');
        sb.append("sobject");
        sb.append('=');
        sb.append(((this.sobject == null)?"<null>":this.sobject));
        sb.append(',');
        sb.append("compactLayouts");
        sb.append('=');
        sb.append(((this.compactLayouts == null)?"<null>":this.compactLayouts));
        sb.append(',');
        sb.append("approvalLayouts");
        sb.append('=');
        sb.append(((this.approvalLayouts == null)?"<null>":this.approvalLayouts));
        sb.append(',');
        sb.append("listviews");
        sb.append('=');
        sb.append(((this.listviews == null)?"<null>":this.listviews));
        sb.append(',');
        sb.append("quickActions");
        sb.append('=');
        sb.append(((this.quickActions == null)?"<null>":this.quickActions));
        sb.append(',');
        sb.append("layouts");
        sb.append('=');
        sb.append(((this.layouts == null)?"<null>":this.layouts));
        sb.append(',');
        sb.append("eventSchema");
        sb.append('=');
        sb.append(((this.eventSchema == null)?"<null>":this.eventSchema));
        sb.append(',');
        sb.append("caseArticleSuggestions");
        sb.append('=');
        sb.append(((this.caseArticleSuggestions == null)?"<null>":this.caseArticleSuggestions));
        sb.append(',');
        sb.append("caseRowArticleSuggestions");
        sb.append('=');
        sb.append(((this.caseRowArticleSuggestions == null)?"<null>":this.caseRowArticleSuggestions));
        sb.append(',');
        sb.append("push");
        sb.append('=');
        sb.append(((this.push == null)?"<null>":this.push));
        sb.append(',');
        sb.append("namedLayouts");
        sb.append('=');
        sb.append(((this.namedLayouts == null)?"<null>":this.namedLayouts));
        sb.append(',');
        sb.append("passwordUtilities");
        sb.append('=');
        sb.append(((this.passwordUtilities == null)?"<null>":this.passwordUtilities));
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
        result = ((result* 31)+((this.namedLayouts == null)? 0 :this.namedLayouts.hashCode()));
        result = ((result* 31)+((this.quickActions == null)? 0 :this.quickActions.hashCode()));
        result = ((result* 31)+((this.layouts == null)? 0 :this.layouts.hashCode()));
        result = ((result* 31)+((this.push == null)? 0 :this.push.hashCode()));
        result = ((result* 31)+((this.compactLayouts == null)? 0 :this.compactLayouts.hashCode()));
        result = ((result* 31)+((this.eventSchema == null)? 0 :this.eventSchema.hashCode()));
        result = ((result* 31)+((this.caseArticleSuggestions == null)? 0 :this.caseArticleSuggestions.hashCode()));
        result = ((result* 31)+((this.caseRowArticleSuggestions == null)? 0 :this.caseRowArticleSuggestions.hashCode()));
        result = ((result* 31)+((this.passwordUtilities == null)? 0 :this.passwordUtilities.hashCode()));
        result = ((result* 31)+((this.defaultValues == null)? 0 :this.defaultValues.hashCode()));
        result = ((result* 31)+((this.listviews == null)? 0 :this.listviews.hashCode()));
        result = ((result* 31)+((this.describe == null)? 0 :this.describe.hashCode()));
        result = ((result* 31)+((this.sobject == null)? 0 :this.sobject.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Urls) == false) {
            return false;
        }
        Urls rhs = ((Urls) other);
        return ((((((((((((((((this.rowTemplate == rhs.rowTemplate)||((this.rowTemplate!= null)&&this.rowTemplate.equals(rhs.rowTemplate)))&&((this.approvalLayouts == rhs.approvalLayouts)||((this.approvalLayouts!= null)&&this.approvalLayouts.equals(rhs.approvalLayouts))))&&((this.namedLayouts == rhs.namedLayouts)||((this.namedLayouts!= null)&&this.namedLayouts.equals(rhs.namedLayouts))))&&((this.quickActions == rhs.quickActions)||((this.quickActions!= null)&&this.quickActions.equals(rhs.quickActions))))&&((this.layouts == rhs.layouts)||((this.layouts!= null)&&this.layouts.equals(rhs.layouts))))&&((this.push == rhs.push)||((this.push!= null)&&this.push.equals(rhs.push))))&&((this.compactLayouts == rhs.compactLayouts)||((this.compactLayouts!= null)&&this.compactLayouts.equals(rhs.compactLayouts))))&&((this.eventSchema == rhs.eventSchema)||((this.eventSchema!= null)&&this.eventSchema.equals(rhs.eventSchema))))&&((this.caseArticleSuggestions == rhs.caseArticleSuggestions)||((this.caseArticleSuggestions!= null)&&this.caseArticleSuggestions.equals(rhs.caseArticleSuggestions))))&&((this.caseRowArticleSuggestions == rhs.caseRowArticleSuggestions)||((this.caseRowArticleSuggestions!= null)&&this.caseRowArticleSuggestions.equals(rhs.caseRowArticleSuggestions))))&&((this.passwordUtilities == rhs.passwordUtilities)||((this.passwordUtilities!= null)&&this.passwordUtilities.equals(rhs.passwordUtilities))))&&((this.defaultValues == rhs.defaultValues)||((this.defaultValues!= null)&&this.defaultValues.equals(rhs.defaultValues))))&&((this.listviews == rhs.listviews)||((this.listviews!= null)&&this.listviews.equals(rhs.listviews))))&&((this.describe == rhs.describe)||((this.describe!= null)&&this.describe.equals(rhs.describe))))&&((this.sobject == rhs.sobject)||((this.sobject!= null)&&this.sobject.equals(rhs.sobject))));
    }

}
