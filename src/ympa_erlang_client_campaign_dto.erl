-module(ympa_erlang_client_campaign_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_campaign_dto/0]).

-type ympa_erlang_client_campaign_dto() ::
    #{ 'domain' => binary(),
       'id' => integer(),
       'clientId' => integer(),
       'business' => ympa_erlang_client_business_dto:ympa_erlang_client_business_dto(),
       'placementType' => ympa_erlang_client_placement_type:ympa_erlang_client_placement_type()
     }.

encode(#{ 'domain' := Domain,
          'id' := Id,
          'clientId' := ClientId,
          'business' := Business,
          'placementType' := PlacementType
        }) ->
    #{ 'domain' => Domain,
       'id' => Id,
       'clientId' => ClientId,
       'business' => Business,
       'placementType' => PlacementType
     }.
