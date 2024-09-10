-module(ympa_erlang_proper_client_quantum_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_quantum_dto/0]).

-export([ympa_erlang_proper_client_quantum_dto/1]).

-export_type([ympa_erlang_proper_client_quantum_dto/0]).

-type ympa_erlang_proper_client_quantum_dto() ::
  [ {'minQuantity', integer() }
  | {'stepQuantity', integer() }
  ].


ympa_erlang_proper_client_quantum_dto() ->
    ympa_erlang_proper_client_quantum_dto([]).

ympa_erlang_proper_client_quantum_dto(Fields) ->
  Default = [ {'minQuantity', integer(1) }
            , {'stepQuantity', integer(1, 100) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

