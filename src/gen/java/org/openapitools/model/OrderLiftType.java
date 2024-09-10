package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum OrderLiftType {
    NOT_NEEDED, MANUAL, ELEVATOR, CARGO_ELEVATOR, FREE, UNKNOWN
}
