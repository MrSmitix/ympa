package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GetChatInfoDTO;

@Canonical
class GetChatsInfoDTO {
    /* Информация о чатах. */
    List<GetChatInfoDTO> chats = new ArrayList<>()
    
    ForwardScrollingPagerDTO paging
}
