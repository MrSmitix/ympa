-module(ympa_erlang_client_order_parcel_box_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_parcel_box_dto/0]).

-type ympa_erlang_client_order_parcel_box_dto() ::
    #{ 'id' => integer(),
       'fulfilmentId' => binary()
     }.

encode(#{ 'id' := Id,
          'fulfilmentId' := FulfilmentId
        }) ->
    #{ 'id' => Id,
       'fulfilmentId' => FulfilmentId
     }.
