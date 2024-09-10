-module(ympa_erlang_client_delivery_service_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_delivery_service_dto/0]).

-type ympa_erlang_client_delivery_service_dto() ::
    #{ 'id' => integer(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
