package com.qcadoo.mes.view.components.select;

import org.json.JSONException;
import org.json.JSONObject;

import com.qcadoo.mes.view.components.FieldComponentState;

public final class SelectComponentState extends FieldComponentState {

    private final SelectComponentPattern selectComponentPattern;

    public SelectComponentState(final SelectComponentPattern selectComponentPattern) {
        super(selectComponentPattern);
        this.selectComponentPattern = selectComponentPattern;
    }

    @Override
    protected JSONObject renderContent() throws JSONException {
        JSONObject json = super.renderContent();
        json.put("values", selectComponentPattern.getValuesJson(getLocale()));
        return json;
    }

}