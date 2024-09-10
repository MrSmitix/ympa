-module(ympa_erlang_proper_client_shows_sales_grouping_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_shows_sales_grouping_type/0]).

-export_type([ympa_erlang_proper_client_shows_sales_grouping_type/0]).

-type ympa_erlang_proper_client_shows_sales_grouping_type() ::
  binary().

ympa_erlang_proper_client_shows_sales_grouping_type() ->
  elements([<<"CATEGORIES">>, <<"OFFERS">>]).

