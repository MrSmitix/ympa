-module(ympa_erlang_proper_client_order_delivery_address_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_delivery_address_dto/0]).

-export([ympa_erlang_proper_client_order_delivery_address_dto/1]).

-export_type([ympa_erlang_proper_client_order_delivery_address_dto/0]).

-type ympa_erlang_proper_client_order_delivery_address_dto() ::
  [ {'country', binary() }
  | {'postcode', binary() }
  | {'city', binary() }
  | {'district', binary() }
  | {'subway', binary() }
  | {'street', binary() }
  | {'house', binary() }
  | {'block', binary() }
  | {'entrance', binary() }
  | {'entryphone', binary() }
  | {'floor', binary() }
  | {'apartment', binary() }
  | {'phone', binary() }
  | {'recipient', binary() }
  | {'gps', ympa_erlang_proper_client_gps_dto:ympa_erlang_proper_client_gps_dto() }
  ].


ympa_erlang_proper_client_order_delivery_address_dto() ->
    ympa_erlang_proper_client_order_delivery_address_dto([]).

ympa_erlang_proper_client_order_delivery_address_dto(Fields) ->
  Default = [ {'country', binary() }
            , {'postcode', binary() }
            , {'city', binary() }
            , {'district', binary() }
            , {'subway', binary() }
            , {'street', binary() }
            , {'house', binary() }
            , {'block', binary() }
            , {'entrance', binary() }
            , {'entryphone', binary() }
            , {'floor', binary() }
            , {'apartment', binary() }
            , {'phone', binary() }
            , {'recipient', binary() }
            , {'gps', ympa_erlang_proper_client_gps_dto:ympa_erlang_proper_client_gps_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

