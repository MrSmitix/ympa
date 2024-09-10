-module(ympa_erlang_client_warehouse_address_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_warehouse_address_dto/0]).

-type ympa_erlang_client_warehouse_address_dto() ::
    #{ 'city' := binary(),
       'street' => binary(),
       'number' => binary(),
       'building' => binary(),
       'block' => binary(),
       'gps' := ympa_erlang_client_gps_dto:ympa_erlang_client_gps_dto()
     }.

encode(#{ 'city' := City,
          'street' := Street,
          'number' := Number,
          'building' := Building,
          'block' := Block,
          'gps' := Gps
        }) ->
    #{ 'city' => City,
       'street' => Street,
       'number' => Number,
       'building' => Building,
       'block' => Block,
       'gps' => Gps
     }.
