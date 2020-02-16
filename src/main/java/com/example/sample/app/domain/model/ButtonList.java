package com.example.sample.app.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"id", "package", "class", "name"})
public class ButtonList {

  public ButtonList(int id, String _package, String _class, String _method) {
    this.id = id;
    this._package = _package;
    this._class = _class;
    this._method = _method;
  }

  @JsonProperty("id")
  private int id;
  @JsonProperty("package")
  private String _package;
  @JsonProperty("class")
  private String _class;
  @JsonProperty("method")
  private String _method;

}
