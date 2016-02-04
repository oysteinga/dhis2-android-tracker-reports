package org.hispindia.bidtrackerreports.mvp.model.local;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hisp.dhis.android.sdk.persistence.models.DataValue;

import java.util.List;

/**
 * Created by Sourabh on 2/2/2016.
 */
public class HIOverdueRow {

    @JsonProperty("trackedEntityInstance")
    public String trackedEntityInstance;
    @JsonProperty("trackedEntityInstanceOrgUnit")
    public String trackedEntityInstanceOrgUnit;
    @JsonProperty("trackedEntityInstanceOrgUnitName")
    public String trackedEntityInstanceOrgUnitName;
    @JsonProperty("trackedEntityInstanceCreated")
    public String trackedEntityInstanceCreated;
    @JsonProperty("trackedEntityInstanceInactive")
    public String trackedEntityInstanceInactive;
    @JsonProperty("event")
    public String event;
    @JsonProperty("program")
    public String program;
    @JsonProperty("programStage")
    public String programStage;
    @JsonProperty("orgUnit")
    public String orgUnit;
    @JsonProperty("orgUnitName")
    public String orgUnitName;
    @JsonProperty("eventDate")
    public String eventDate;
    @JsonProperty("dueDate")
    public String dueDate;

    @JsonProperty("attributes")
    public List<HIAttribute> attributes;


    @JsonProperty("dataValues")
    List<DataValue> dataValues;

    @JsonProperty("notes")
    public List<HINotes> notes;
}