package com.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ContextChannelDescription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-23T10:25:57.123Z[GMT]")
public class ContextChannelDescription {
	/**
	 * Gets or Sets _atId
	 */
	public enum AtIdEnum {
		CHANNELDESCRIPTION("ews:channelDescription");

		private String value;

		AtIdEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AtIdEnum fromValue(String text) {
			for (AtIdEnum b : AtIdEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("@id")
	private AtIdEnum _atId = null;

	/**
	 * Gets or Sets _atLanguage
	 */
	public enum AtLanguageEnum {
		EN("en");

		private String value;

		AtLanguageEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AtLanguageEnum fromValue(String text) {
			for (AtLanguageEnum b : AtLanguageEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("@language")
	private AtLanguageEnum _atLanguage = null;

	public ContextChannelDescription _atId(AtIdEnum _atId) {
		this._atId = _atId;
		return this;
	}

	/**
	 * Get _atId
	 * 
	 * @return _atId
	 **/
	@ApiModelProperty(value = "")

	public AtIdEnum getAtId() {
		return _atId;
	}

	public void setAtId(AtIdEnum _atId) {
		this._atId = _atId;
	}

	public ContextChannelDescription _atLanguage(AtLanguageEnum _atLanguage) {
		this._atLanguage = _atLanguage;
		return this;
	}

	/**
	 * Get _atLanguage
	 * 
	 * @return _atLanguage
	 **/
	@ApiModelProperty(value = "")

	public AtLanguageEnum getAtLanguage() {
		return _atLanguage;
	}

	public void setAtLanguage(AtLanguageEnum _atLanguage) {
		this._atLanguage = _atLanguage;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ContextChannelDescription contextChannelDescription = (ContextChannelDescription) o;
		return Objects.equals(this._atId, contextChannelDescription._atId)
				&& Objects.equals(this._atLanguage, contextChannelDescription._atLanguage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(_atId, _atLanguage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ContextChannelDescription {\n");

		sb.append("    _atId: ").append(toIndentedString(_atId)).append("\n");
		sb.append("    _atLanguage: ").append(toIndentedString(_atLanguage)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
