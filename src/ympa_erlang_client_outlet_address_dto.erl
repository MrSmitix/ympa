-module(ympa_erlang_client_outlet_address_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_outlet_address_dto/0]).

-type ympa_erlang_client_outlet_address_dto() ::
    #{ 'regionId' := integer(),
       'street' => binary(),
       'number' => binary(),
       'building' => binary(),
       'estate' => binary(),
       'block' => binary(),
       'additional' => binary(),
       'km' => integer(),
       'city' => binary()
     }.

encode(#{ 'regionId' := RegionId,
          'street' := Street,
          'number' := Number,
          'building' := Building,
          'estate' := Estate,
          'block' := Block,
          'additional' := Additional,
          'km' := Km,
          'city' := City
        }) ->
    #{ 'regionId' => RegionId,
       'street' => Street,
       'number' => Number,
       'building' => Building,
       'estate' => Estate,
       'block' => Block,
       'additional' => Additional,
       'km' => Km,
       'city' => City
     }.
