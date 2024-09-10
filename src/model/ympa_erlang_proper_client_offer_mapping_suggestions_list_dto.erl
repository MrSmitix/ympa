-module(ympa_erlang_proper_client_offer_mapping_suggestions_list_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_mapping_suggestions_list_dto/0]).

-export([ympa_erlang_proper_client_offer_mapping_suggestions_list_dto/1]).

-export_type([ympa_erlang_proper_client_offer_mapping_suggestions_list_dto/0]).

-type ympa_erlang_proper_client_offer_mapping_suggestions_list_dto() ::
  [ {'offers', list(ympa_erlang_proper_client_enriched_mappings_offer_dto:ympa_erlang_proper_client_enriched_mappings_offer_dto()) }
  ].


ympa_erlang_proper_client_offer_mapping_suggestions_list_dto() ->
    ympa_erlang_proper_client_offer_mapping_suggestions_list_dto([]).

ympa_erlang_proper_client_offer_mapping_suggestions_list_dto(Fields) ->
  Default = [ {'offers', list(ympa_erlang_proper_client_enriched_mappings_offer_dto:ympa_erlang_proper_client_enriched_mappings_offer_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

