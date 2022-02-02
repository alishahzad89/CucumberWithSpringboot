package com.cucumber.springboot.response.error;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "txRef",
        "error"
})
public class BoltErrorResponse {

    @JsonProperty("txRef")
    private String txRef;
    @JsonProperty("error")
    private BoltError error;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("txRef")
    public String getTxRef() {
        return txRef;
    }

    @JsonProperty("txRef")
    public void setTxRef(String txRef) {
        this.txRef = txRef;
    }

    @JsonProperty("error")
    public BoltError getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(BoltError error) {
        this.error = error;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
