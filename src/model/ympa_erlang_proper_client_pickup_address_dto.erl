-module(ympa_erlang_proper_client_pickup_address_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_pickup_address_dto/0]).

-export([ympa_erlang_proper_client_pickup_address_dto/1]).

-export_type([ympa_erlang_proper_client_pickup_address_dto/0]).

-type ympa_erlang_proper_client_pickup_address_dto() ::
  [ {'country', binary() }
  | {'city', binary() }
  | {'street', binary() }
  | {'house', binary() }
  | {'postcode', binary() }
  ].


ympa_erlang_proper_client_pickup_address_dto() ->
    ympa_erlang_proper_client_pickup_address_dto([]).

ympa_erlang_proper_client_pickup_address_dto(Fields) ->
  Default = [ {'country', binary() }
            , {'city', binary() }
            , {'street', binary() }
            , {'house', binary() }
            , {'postcode', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

