-module(ympa_erlang_proper_client_business_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_business_dto/0]).

-export([ympa_erlang_proper_client_business_dto/1]).

-export_type([ympa_erlang_proper_client_business_dto/0]).

-type ympa_erlang_proper_client_business_dto() ::
  [ {'id', integer() }
  | {'name', binary() }
  ].


ympa_erlang_proper_client_business_dto() ->
    ympa_erlang_proper_client_business_dto([]).

ympa_erlang_proper_client_business_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

