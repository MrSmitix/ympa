-module(ympa_erlang_client_campaign_settings_local_region_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_campaign_settings_local_region_dto/0]).

-type ympa_erlang_client_campaign_settings_local_region_dto() ::
    #{ 'id' => integer(),
       'name' => binary(),
       'type' => ympa_erlang_client_region_type:ympa_erlang_client_region_type(),
       'deliveryOptionsSource' => ympa_erlang_client_campaign_settings_schedule_source_type:ympa_erlang_client_campaign_settings_schedule_source_type(),
       'delivery' => ympa_erlang_client_campaign_settings_delivery_dto:ympa_erlang_client_campaign_settings_delivery_dto()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'type' := Type,
          'deliveryOptionsSource' := DeliveryOptionsSource,
          'delivery' := Delivery
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'type' => Type,
       'deliveryOptionsSource' => DeliveryOptionsSource,
       'delivery' => Delivery
     }.
