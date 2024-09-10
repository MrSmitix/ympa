-module(ympa_erlang_client_pickup_address_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_pickup_address_dto/0]).

-type ympa_erlang_client_pickup_address_dto() ::
    #{ 'country' => binary(),
       'city' => binary(),
       'street' => binary(),
       'house' => binary(),
       'postcode' => binary()
     }.

encode(#{ 'country' := Country,
          'city' := City,
          'street' := Street,
          'house' := House,
          'postcode' := Postcode
        }) ->
    #{ 'country' => Country,
       'city' => City,
       'street' => Street,
       'house' => House,
       'postcode' => Postcode
     }.
