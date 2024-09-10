-module(ympa_erlang_proper_client_search_shipments_response_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_search_shipments_response_dto/0]).

-export([ympa_erlang_proper_client_search_shipments_response_dto/1]).

-export_type([ympa_erlang_proper_client_search_shipments_response_dto/0]).

-type ympa_erlang_proper_client_search_shipments_response_dto() ::
  [ {'shipments', list(ympa_erlang_proper_client_shipment_info_dto:ympa_erlang_proper_client_shipment_info_dto()) }
  | {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  ].


ympa_erlang_proper_client_search_shipments_response_dto() ->
    ympa_erlang_proper_client_search_shipments_response_dto([]).

ympa_erlang_proper_client_search_shipments_response_dto(Fields) ->
  Default = [ {'shipments', list(ympa_erlang_proper_client_shipment_info_dto:ympa_erlang_proper_client_shipment_info_dto()) }
            , {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

