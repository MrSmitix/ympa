-module(ympa_erlang_client_partner_shipment_warehouse_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_partner_shipment_warehouse_dto/0]).

-type ympa_erlang_client_partner_shipment_warehouse_dto() ::
    #{ 'id' => integer(),
       'name' => binary(),
       'address' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'address' := Address
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'address' => Address
     }.
