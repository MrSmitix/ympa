-module(ympa_erlang_proper_client_update_offer_mapping_entry_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_offer_mapping_entry_request/0]).

-export([ympa_erlang_proper_client_update_offer_mapping_entry_request/1]).

-export_type([ympa_erlang_proper_client_update_offer_mapping_entry_request/0]).

-type ympa_erlang_proper_client_update_offer_mapping_entry_request() ::
  [ {'offerMappingEntries', list(ympa_erlang_proper_client_update_offer_mapping_entry_dto:ympa_erlang_proper_client_update_offer_mapping_entry_dto()) }
  ].


ympa_erlang_proper_client_update_offer_mapping_entry_request() ->
    ympa_erlang_proper_client_update_offer_mapping_entry_request([]).

ympa_erlang_proper_client_update_offer_mapping_entry_request(Fields) ->
  Default = [ {'offerMappingEntries', list(ympa_erlang_proper_client_update_offer_mapping_entry_dto:ympa_erlang_proper_client_update_offer_mapping_entry_dto(), 1, 500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

