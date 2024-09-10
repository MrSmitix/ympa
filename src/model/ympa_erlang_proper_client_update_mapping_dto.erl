-module(ympa_erlang_proper_client_update_mapping_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_mapping_dto/0]).

-export([ympa_erlang_proper_client_update_mapping_dto/1]).

-export_type([ympa_erlang_proper_client_update_mapping_dto/0]).

-type ympa_erlang_proper_client_update_mapping_dto() ::
  [ {'marketSku', integer() }
  ].


ympa_erlang_proper_client_update_mapping_dto() ->
    ympa_erlang_proper_client_update_mapping_dto([]).

ympa_erlang_proper_client_update_mapping_dto(Fields) ->
  Default = [ {'marketSku', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

