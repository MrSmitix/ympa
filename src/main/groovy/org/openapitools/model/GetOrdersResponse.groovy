package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.OrderDTO;

@Canonical
class GetOrdersResponse {
    
    FlippingPagerDTO pager
    /* Модель заказа.  */
    List<OrderDTO> orders = new ArrayList<>()
    
    ForwardScrollingPagerDTO paging
}
