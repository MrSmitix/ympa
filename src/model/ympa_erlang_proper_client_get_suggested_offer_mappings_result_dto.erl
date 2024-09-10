-module(ympa_erlang_proper_client_get_suggested_offer_mappings_result_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_suggested_offer_mappings_result_dto/0]).

-export([ympa_erlang_proper_client_get_suggested_offer_mappings_result_dto/1]).

-export_type([ympa_erlang_proper_client_get_suggested_offer_mappings_result_dto/0]).

-type ympa_erlang_proper_client_get_suggested_offer_mappings_result_dto() ::
  [ {'offers', list(ympa_erlang_proper_client_suggested_offer_mapping_dto:ympa_erlang_proper_client_suggested_offer_mapping_dto()) }
  ].


ympa_erlang_proper_client_get_suggested_offer_mappings_result_dto() ->
    ympa_erlang_proper_client_get_suggested_offer_mappings_result_dto([]).

ympa_erlang_proper_client_get_suggested_offer_mappings_result_dto(Fields) ->
  Default = [ {'offers', list(ympa_erlang_proper_client_suggested_offer_mapping_dto:ympa_erlang_proper_client_suggested_offer_mapping_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

