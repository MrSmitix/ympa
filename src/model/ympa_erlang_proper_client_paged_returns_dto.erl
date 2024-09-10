-module(ympa_erlang_proper_client_paged_returns_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_paged_returns_dto/0]).

-export([ympa_erlang_proper_client_paged_returns_dto/1]).

-export_type([ympa_erlang_proper_client_paged_returns_dto/0]).

-type ympa_erlang_proper_client_paged_returns_dto() ::
  [ {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  | {'returns', list(ympa_erlang_proper_client_return_dto:ympa_erlang_proper_client_return_dto()) }
  ].


ympa_erlang_proper_client_paged_returns_dto() ->
    ympa_erlang_proper_client_paged_returns_dto([]).

ympa_erlang_proper_client_paged_returns_dto(Fields) ->
  Default = [ {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            , {'returns', list(ympa_erlang_proper_client_return_dto:ympa_erlang_proper_client_return_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

