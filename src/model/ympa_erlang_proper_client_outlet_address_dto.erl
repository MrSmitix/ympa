-module(ympa_erlang_proper_client_outlet_address_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_outlet_address_dto/0]).

-export([ympa_erlang_proper_client_outlet_address_dto/1]).

-export_type([ympa_erlang_proper_client_outlet_address_dto/0]).

-type ympa_erlang_proper_client_outlet_address_dto() ::
  [ {'regionId', integer() }
  | {'street', binary() }
  | {'number', binary() }
  | {'building', binary() }
  | {'estate', binary() }
  | {'block', binary() }
  | {'additional', binary() }
  | {'km', integer() }
  | {'city', binary() }
  ].


ympa_erlang_proper_client_outlet_address_dto() ->
    ympa_erlang_proper_client_outlet_address_dto([]).

ympa_erlang_proper_client_outlet_address_dto(Fields) ->
  Default = [ {'regionId', integer() }
            , {'street', binary() }
            , {'number', binary() }
            , {'building', binary() }
            , {'estate', binary() }
            , {'block', binary() }
            , {'additional', binary() }
            , {'km', integer() }
            , {'city', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

