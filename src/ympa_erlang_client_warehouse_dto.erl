-module(ympa_erlang_client_warehouse_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_warehouse_dto/0]).

-type ympa_erlang_client_warehouse_dto() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'campaignId' := integer(),
       'express' := boolean(),
       'address' => ympa_erlang_client_warehouse_address_dto:ympa_erlang_client_warehouse_address_dto()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'campaignId' := CampaignId,
          'express' := Express,
          'address' := Address
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'campaignId' => CampaignId,
       'express' => Express,
       'address' => Address
     }.
