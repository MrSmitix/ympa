-module(ympa_erlang_proper_client_update_offer_mappings_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_offer_mappings_request/0]).

-export([ympa_erlang_proper_client_update_offer_mappings_request/1]).

-export_type([ympa_erlang_proper_client_update_offer_mappings_request/0]).

-type ympa_erlang_proper_client_update_offer_mappings_request() ::
  [ {'offerMappings', list(ympa_erlang_proper_client_update_offer_mapping_dto:ympa_erlang_proper_client_update_offer_mapping_dto()) }
  | {'onlyPartnerMediaContent', boolean() }
  ].


ympa_erlang_proper_client_update_offer_mappings_request() ->
    ympa_erlang_proper_client_update_offer_mappings_request([]).

ympa_erlang_proper_client_update_offer_mappings_request(Fields) ->
  Default = [ {'offerMappings', list(ympa_erlang_proper_client_update_offer_mapping_dto:ympa_erlang_proper_client_update_offer_mapping_dto(), 1, 500) }
            , {'onlyPartnerMediaContent', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

