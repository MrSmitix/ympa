-module(ympa_erlang_proper_client_get_bids_info_response_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_bids_info_response_dto/0]).

-export([ympa_erlang_proper_client_get_bids_info_response_dto/1]).

-export_type([ympa_erlang_proper_client_get_bids_info_response_dto/0]).

-type ympa_erlang_proper_client_get_bids_info_response_dto() ::
  [ {'bids', list(ympa_erlang_proper_client_sku_bid_item_dto:ympa_erlang_proper_client_sku_bid_item_dto()) }
  | {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  ].


ympa_erlang_proper_client_get_bids_info_response_dto() ->
    ympa_erlang_proper_client_get_bids_info_response_dto([]).

ympa_erlang_proper_client_get_bids_info_response_dto(Fields) ->
  Default = [ {'bids', list(ympa_erlang_proper_client_sku_bid_item_dto:ympa_erlang_proper_client_sku_bid_item_dto()) }
            , {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

