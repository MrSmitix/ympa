-module(ympa_erlang_proper_client_offer_mapping_error_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_mapping_error_dto/0]).

-export([ympa_erlang_proper_client_offer_mapping_error_dto/1]).

-export_type([ympa_erlang_proper_client_offer_mapping_error_dto/0]).

-type ympa_erlang_proper_client_offer_mapping_error_dto() ::
  [ {'type', ympa_erlang_proper_client_offer_mapping_error_type:ympa_erlang_proper_client_offer_mapping_error_type() }
  | {'parameterId', integer() }
  | {'message', binary() }
  ].


ympa_erlang_proper_client_offer_mapping_error_dto() ->
    ympa_erlang_proper_client_offer_mapping_error_dto([]).

ympa_erlang_proper_client_offer_mapping_error_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_offer_mapping_error_type:ympa_erlang_proper_client_offer_mapping_error_type() }
            , {'parameterId', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

