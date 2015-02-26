package jp.mts.tddexercise.acceptance.tests.working;

import jp.mts.tddexercise.acceptance.helpers.AuctionSniperUi;
import jp.mts.tddexercise.acceptance.helpers.FakeAuctionServer;

import org.junit.Test;

public class AuctionSniperEndToEndTest {
	private final FakeAuctionServer auction = new FakeAuctionServer("item-54321");
	private final AuctionSniperUi ui = new AuctionSniperUi();

	@Test public void
	sniperJoinsAuctionUntilAuctionCloses(){
		auction.startSellingItem();
		ui.startBiddingIn(auction);
		auction.hasReceivedJoinRequestFromSniper();
		auction.announceClosed();
		ui.showsSniperHasLostAuction();
	}
}
