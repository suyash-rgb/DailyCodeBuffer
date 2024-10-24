package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfPolygonAnglesTest {

	@Test
	void testSumOfAngleseEquals3() {
		assertEquals(180, SumOfPolygonAngles.sumOfAngles(3));

	}
	
	@Test
	void testSumOfAngleseLessThan3() {
		assertEquals(0, SumOfPolygonAngles.sumOfAngles(2));

	}

	@Test
	void testSumOfAngleseGreaterThan3() {
		assertEquals(360, SumOfPolygonAngles.sumOfAngles(4));

	}
	
	@Test
	public void test004() { 
		assertEquals(720, SumOfPolygonAngles.sumOfAngles(6));
	}

	@Test
	public void test005() { 
		assertEquals(900, SumOfPolygonAngles.sumOfAngles(7));
	}

	@Test
	public void test006() { 
		assertEquals(1080, SumOfPolygonAngles.sumOfAngles(8));
	}

	@Test
	public void test007() { 
		assertEquals(1260, SumOfPolygonAngles.sumOfAngles(9));
	}

	@Test
	public void test008() { 
		assertEquals(1440, SumOfPolygonAngles.sumOfAngles(10));
	}

	@Test
	public void test009() { 
		assertEquals(1620, SumOfPolygonAngles.sumOfAngles(11));
	}

	@Test
	public void test010() { 
		assertEquals(1800, SumOfPolygonAngles.sumOfAngles(12));
	}

	@Test
	public void test011() { 
		assertEquals(1980, SumOfPolygonAngles.sumOfAngles(13));
	}

	@Test
	public void test012() { 
		assertEquals(2160, SumOfPolygonAngles.sumOfAngles(14));
	}

	@Test
	public void test013() { 
		assertEquals(2340, SumOfPolygonAngles.sumOfAngles(15));
	}

	@Test
	public void test014() { 
		assertEquals(2520, SumOfPolygonAngles.sumOfAngles(16));
	}

	@Test
	public void test015() { 
		assertEquals(2700, SumOfPolygonAngles.sumOfAngles(17));
	}

	@Test
	public void test016() { 
		assertEquals(2880, SumOfPolygonAngles.sumOfAngles(18));
	}

	@Test
	public void test017() { 
		assertEquals(3060, SumOfPolygonAngles.sumOfAngles(19));
	}

	@Test
	public void test018() { 
		assertEquals(3240, SumOfPolygonAngles.sumOfAngles(20));
	}

	@Test
	public void test019() { 
		assertEquals(3420, SumOfPolygonAngles.sumOfAngles(21));
	}

	@Test
	public void test020() { 
		assertEquals(3600, SumOfPolygonAngles.sumOfAngles(22));
	}

	@Test
	public void test021() { 
		assertEquals(3780, SumOfPolygonAngles.sumOfAngles(23));
	}

	@Test
	public void test022() { 
		assertEquals(3960, SumOfPolygonAngles.sumOfAngles(24));
	}

	@Test
	public void test023() { 
		assertEquals(4140, SumOfPolygonAngles.sumOfAngles(25));
	}

	@Test
	public void test024() { 
		assertEquals(4320, SumOfPolygonAngles.sumOfAngles(26));
	}

	@Test
	public void test025() { 
		assertEquals(4500, SumOfPolygonAngles.sumOfAngles(27));
	}

	@Test
	public void test026() { 
		assertEquals(4680, SumOfPolygonAngles.sumOfAngles(28));
	}

	@Test
	public void test027() { 
		assertEquals(4860, SumOfPolygonAngles.sumOfAngles(29));
	}

	@Test
	public void test028() { 
		assertEquals(5040, SumOfPolygonAngles.sumOfAngles(30));
	}

	@Test
	public void test029() { 
		assertEquals(5220, SumOfPolygonAngles.sumOfAngles(31));
	}

	@Test
	public void test030() { 
		assertEquals(5400, SumOfPolygonAngles.sumOfAngles(32));
	}

	@Test
	public void test031() { 
		assertEquals(5580, SumOfPolygonAngles.sumOfAngles(33));
	}

	@Test
	public void test032() { 
		assertEquals(5760, SumOfPolygonAngles.sumOfAngles(34));
	}

	@Test
	public void test033() { 
		assertEquals(5940, SumOfPolygonAngles.sumOfAngles(35));
	}

	@Test
	public void test034() { 
		assertEquals(6120, SumOfPolygonAngles.sumOfAngles(36));
	}

	@Test
	public void test035() { 
		assertEquals(6300, SumOfPolygonAngles.sumOfAngles(37));
	}

	@Test
	public void test036() { 
		assertEquals(6480, SumOfPolygonAngles.sumOfAngles(38));
	}

	@Test
	public void test037() { 
		assertEquals(6660, SumOfPolygonAngles.sumOfAngles(39));
	}

	@Test
	public void test038() { 
		assertEquals(6840, SumOfPolygonAngles.sumOfAngles(40));
	}

	@Test
	public void test039() { 
		assertEquals(7020, SumOfPolygonAngles.sumOfAngles(41));
	}

	@Test
	public void test040() { 
		assertEquals(7200, SumOfPolygonAngles.sumOfAngles(42));
	}

	@Test
	public void test041() { 
		assertEquals(7380, SumOfPolygonAngles.sumOfAngles(43));
	}

	@Test
	public void test042() { 
		assertEquals(7560, SumOfPolygonAngles.sumOfAngles(44));
	}

	@Test
	public void test043() { 
		assertEquals(7740, SumOfPolygonAngles.sumOfAngles(45));
	}

	@Test
	public void test044() { 
		assertEquals(7920, SumOfPolygonAngles.sumOfAngles(46));
	}

	@Test
	public void test045() { 
		assertEquals(8100, SumOfPolygonAngles.sumOfAngles(47));
	}

	@Test
	public void test046() { 
		assertEquals(8280, SumOfPolygonAngles.sumOfAngles(48));
	}

	@Test
	public void test047() { 
		assertEquals(8460, SumOfPolygonAngles.sumOfAngles(49));
	}

	@Test
	public void test048() { 
		assertEquals(8640, SumOfPolygonAngles.sumOfAngles(50));
	}

	@Test
	public void test049() { 
		assertEquals(8820, SumOfPolygonAngles.sumOfAngles(51));
	}

	@Test
	public void test050() { 
		assertEquals(9000, SumOfPolygonAngles.sumOfAngles(52));
	}

	@Test
	public void test051() { 
		assertEquals(9180, SumOfPolygonAngles.sumOfAngles(53));
	}

	@Test
	public void test052() { 
		assertEquals(9360, SumOfPolygonAngles.sumOfAngles(54));
	}

	@Test
	public void test053() { 
		assertEquals(9540, SumOfPolygonAngles.sumOfAngles(55));
	}

	@Test
	public void test054() { 
		assertEquals(9720, SumOfPolygonAngles.sumOfAngles(56));
	}

	@Test
	public void test055() { 
		assertEquals(9900, SumOfPolygonAngles.sumOfAngles(57));
	}

	@Test
	public void test056() { 
		assertEquals(10080, SumOfPolygonAngles.sumOfAngles(58));
	}

	@Test
	public void test057() { 
		assertEquals(10260, SumOfPolygonAngles.sumOfAngles(59));
	}

	@Test
	public void test058() { 
		assertEquals(10440, SumOfPolygonAngles.sumOfAngles(60));
	}

	@Test
	public void test059() { 
		assertEquals(10620, SumOfPolygonAngles.sumOfAngles(61));
	}

	@Test
	public void test060() { 
		assertEquals(10800, SumOfPolygonAngles.sumOfAngles(62));
	}

	@Test
	public void test061() { 
		assertEquals(10980, SumOfPolygonAngles.sumOfAngles(63));
	}

	@Test
	public void test062() { 
		assertEquals(11160, SumOfPolygonAngles.sumOfAngles(64));
	}

	@Test
	public void test063() { 
		assertEquals(11340, SumOfPolygonAngles.sumOfAngles(65));
	}

	@Test
	public void test064() { 
		assertEquals(11520, SumOfPolygonAngles.sumOfAngles(66));
	}

	@Test
	public void test065() { 
		assertEquals(11700, SumOfPolygonAngles.sumOfAngles(67));
	}

	@Test
	public void test066() { 
		assertEquals(11880, SumOfPolygonAngles.sumOfAngles(68));
	}

	@Test
	public void test067() { 
		assertEquals(12060, SumOfPolygonAngles.sumOfAngles(69));
	}

	@Test
	public void test068() { 
		assertEquals(12240, SumOfPolygonAngles.sumOfAngles(70));
	}

	@Test
	public void test069() { 
		assertEquals(12420, SumOfPolygonAngles.sumOfAngles(71));
	}

	@Test
	public void test070() { 
		assertEquals(12600, SumOfPolygonAngles.sumOfAngles(72));
	}

	@Test
	public void test071() { 
		assertEquals(12780, SumOfPolygonAngles.sumOfAngles(73));
	}

	@Test
	public void test072() { 
		assertEquals(12960, SumOfPolygonAngles.sumOfAngles(74));
	}

	@Test
	public void test073() { 
		assertEquals(13140, SumOfPolygonAngles.sumOfAngles(75));
	}

	@Test
	public void test074() { 
		assertEquals(13320, SumOfPolygonAngles.sumOfAngles(76));
	}

	@Test
	public void test075() { 
		assertEquals(13500, SumOfPolygonAngles.sumOfAngles(77));
	}

	@Test
	public void test076() { 
		assertEquals(13680, SumOfPolygonAngles.sumOfAngles(78));
	}

	@Test
	public void test077() { 
		assertEquals(13860, SumOfPolygonAngles.sumOfAngles(79));
	}

	@Test
	public void test078() { 
		assertEquals(14040, SumOfPolygonAngles.sumOfAngles(80));
	}

	@Test
	public void test079() { 
		assertEquals(14220, SumOfPolygonAngles.sumOfAngles(81));
	}

	@Test
	public void test080() { 
		assertEquals(14400, SumOfPolygonAngles.sumOfAngles(82));
	}

	@Test
	public void test081() { 
		assertEquals(14580, SumOfPolygonAngles.sumOfAngles(83));
	}

	@Test
	public void test082() { 
		assertEquals(14760, SumOfPolygonAngles.sumOfAngles(84));
	}

	@Test
	public void test083() { 
		assertEquals(14940, SumOfPolygonAngles.sumOfAngles(85));
	}

	@Test
	public void test084() { 
		assertEquals(15120, SumOfPolygonAngles.sumOfAngles(86));
	}

	@Test
	public void test085() { 
		assertEquals(15300, SumOfPolygonAngles.sumOfAngles(87));
	}

	@Test
	public void test086() { 
		assertEquals(15480, SumOfPolygonAngles.sumOfAngles(88));
	}

	@Test
	public void test087() { 
		assertEquals(15660, SumOfPolygonAngles.sumOfAngles(89));
	}

	@Test
	public void test088() { 
		assertEquals(15840, SumOfPolygonAngles.sumOfAngles(90));
	}

	@Test
	public void test089() { 
		assertEquals(16020, SumOfPolygonAngles.sumOfAngles(91));
	}

	@Test
	public void test090() { 
		assertEquals(16200, SumOfPolygonAngles.sumOfAngles(92));
	}

	@Test
	public void test091() { 
		assertEquals(16380, SumOfPolygonAngles.sumOfAngles(93));
	}

	@Test
	public void test092() { 
		assertEquals(16560, SumOfPolygonAngles.sumOfAngles(94));
	}

	@Test
	public void test093() { 
		assertEquals(16740, SumOfPolygonAngles.sumOfAngles(95));
	}

	@Test
	public void test094() { 
		assertEquals(16920, SumOfPolygonAngles.sumOfAngles(96));
	}

	@Test
	public void test095() { 
		assertEquals(17100, SumOfPolygonAngles.sumOfAngles(97));
	}

	@Test
	public void test096() { 
		assertEquals(17280, SumOfPolygonAngles.sumOfAngles(98));
	}

	@Test
	public void test097() { 
		assertEquals(17460, SumOfPolygonAngles.sumOfAngles(99));
	}

	@Test
	public void test098() { 
		assertEquals(17640, SumOfPolygonAngles.sumOfAngles(100));
	}

	@Test
	public void test099() { 
		assertEquals(17820, SumOfPolygonAngles.sumOfAngles(101));
	}

	@Test
	public void test100() { 
		assertEquals(18000, SumOfPolygonAngles.sumOfAngles(102));
	}

	@Test
	public void test101() { 
		assertEquals(18180, SumOfPolygonAngles.sumOfAngles(103));
	}

	@Test
	public void test102() { 
		assertEquals(18360, SumOfPolygonAngles.sumOfAngles(104));
	}

	@Test
	public void test103() { 
		assertEquals(18540, SumOfPolygonAngles.sumOfAngles(105));
	}

	@Test
	public void test104() { 
		assertEquals(18720, SumOfPolygonAngles.sumOfAngles(106));
	}

	@Test
	public void test105() { 
		assertEquals(18900, SumOfPolygonAngles.sumOfAngles(107));
	}

	@Test
	public void test106() { 
		assertEquals(19080, SumOfPolygonAngles.sumOfAngles(108));
	}

	@Test
	public void test107() { 
		assertEquals(19260, SumOfPolygonAngles.sumOfAngles(109));
	}

	@Test
	public void test108() { 
		assertEquals(19440, SumOfPolygonAngles.sumOfAngles(110));
	}

	@Test
	public void test109() { 
		assertEquals(19620, SumOfPolygonAngles.sumOfAngles(111));
	}

	@Test
	public void test110() { 
		assertEquals(19800, SumOfPolygonAngles.sumOfAngles(112));
	}

	@Test
	public void test111() { 
		assertEquals(19980, SumOfPolygonAngles.sumOfAngles(113));
	}

	@Test
	public void test112() { 
		assertEquals(20160, SumOfPolygonAngles.sumOfAngles(114));
	}

	@Test
	public void test113() { 
		assertEquals(20340, SumOfPolygonAngles.sumOfAngles(115));
	}

	@Test
	public void test114() { 
		assertEquals(20520, SumOfPolygonAngles.sumOfAngles(116));
	}

	@Test
	public void test115() { 
		assertEquals(20700, SumOfPolygonAngles.sumOfAngles(117));
	}

	@Test
	public void test116() { 
		assertEquals(20880, SumOfPolygonAngles.sumOfAngles(118));
	}

	@Test
	public void test117() { 
		assertEquals(21060, SumOfPolygonAngles.sumOfAngles(119));
	}

	@Test
	public void test118() { 
		assertEquals(21240, SumOfPolygonAngles.sumOfAngles(120));
	}

	@Test
	public void test119() { 
		assertEquals(21420, SumOfPolygonAngles.sumOfAngles(121));
	}

	@Test
	public void test120() { 
		assertEquals(21600, SumOfPolygonAngles.sumOfAngles(122));
	}

	@Test
	public void test121() { 
		assertEquals(21780, SumOfPolygonAngles.sumOfAngles(123));
	}

	@Test
	public void test122() { 
		assertEquals(21960, SumOfPolygonAngles.sumOfAngles(124));
	}

	@Test
	public void test123() { 
		assertEquals(22140, SumOfPolygonAngles.sumOfAngles(125));
	}

	@Test
	public void test124() { 
		assertEquals(22320, SumOfPolygonAngles.sumOfAngles(126));
	}

	@Test
	public void test125() { 
		assertEquals(22500, SumOfPolygonAngles.sumOfAngles(127));
	}

	@Test
	public void test126() { 
		assertEquals(22680, SumOfPolygonAngles.sumOfAngles(128));
	}

	@Test
	public void test127() { 
		assertEquals(22860, SumOfPolygonAngles.sumOfAngles(129));
	}

	@Test
	public void test128() { 
		assertEquals(23040, SumOfPolygonAngles.sumOfAngles(130));
	}

	@Test
	public void test129() { 
		assertEquals(23220, SumOfPolygonAngles.sumOfAngles(131));
	}

	@Test
	public void test130() { 
		assertEquals(23400, SumOfPolygonAngles.sumOfAngles(132));
	}

	@Test
	public void test131() { 
		assertEquals(23580, SumOfPolygonAngles.sumOfAngles(133));
	}

	@Test
	public void test132() { 
		assertEquals(23760, SumOfPolygonAngles.sumOfAngles(134));
	}

	@Test
	public void test133() { 
		assertEquals(23940, SumOfPolygonAngles.sumOfAngles(135));
	}

	@Test
	public void test134() { 
		assertEquals(24120, SumOfPolygonAngles.sumOfAngles(136));
	}

	@Test
	public void test135() { 
		assertEquals(24300, SumOfPolygonAngles.sumOfAngles(137));
	}

	@Test
	public void test136() { 
		assertEquals(24480, SumOfPolygonAngles.sumOfAngles(138));
	}

	@Test
	public void test137() { 
		assertEquals(24660, SumOfPolygonAngles.sumOfAngles(139));
	}

	@Test
	public void test138() { 
		assertEquals(24840, SumOfPolygonAngles.sumOfAngles(140));
	}

	@Test
	public void test139() { 
		assertEquals(25020, SumOfPolygonAngles.sumOfAngles(141));
	}

	@Test
	public void test140() { 
		assertEquals(25200, SumOfPolygonAngles.sumOfAngles(142));
	}

	@Test
	public void test141() { 
		assertEquals(25380, SumOfPolygonAngles.sumOfAngles(143));
	}

	@Test
	public void test142() { 
		assertEquals(25560, SumOfPolygonAngles.sumOfAngles(144));
	}

	@Test
	public void test143() { 
		assertEquals(25740, SumOfPolygonAngles.sumOfAngles(145));
	}

	@Test
	public void test144() { 
		assertEquals(25920, SumOfPolygonAngles.sumOfAngles(146));
	}

	@Test
	public void test145() { 
		assertEquals(26100, SumOfPolygonAngles.sumOfAngles(147));
	}

	@Test
	public void test146() { 
		assertEquals(26280, SumOfPolygonAngles.sumOfAngles(148));
	}

	@Test
	public void test147() { 
		assertEquals(26460, SumOfPolygonAngles.sumOfAngles(149));
	}

	@Test
	public void test148() { 
		assertEquals(26640, SumOfPolygonAngles.sumOfAngles(150));
	}

	@Test
	public void test149() { 
		assertEquals(26820, SumOfPolygonAngles.sumOfAngles(151));
	}

	@Test
	public void test150() { 
		assertEquals(27000, SumOfPolygonAngles.sumOfAngles(152));
	}

	@Test
	public void test151() { 
		assertEquals(27180, SumOfPolygonAngles.sumOfAngles(153));
	}

	@Test
	public void test152() { 
		assertEquals(27360, SumOfPolygonAngles.sumOfAngles(154));
	}

	@Test
	public void test153() { 
		assertEquals(27540, SumOfPolygonAngles.sumOfAngles(155));
	}

	@Test
	public void test154() { 
		assertEquals(27720, SumOfPolygonAngles.sumOfAngles(156));
	}

	@Test
	public void test155() { 
		assertEquals(27900, SumOfPolygonAngles.sumOfAngles(157));
	}

	@Test
	public void test156() { 
		assertEquals(28080, SumOfPolygonAngles.sumOfAngles(158));
	}

	@Test
	public void test157() { 
		assertEquals(28260, SumOfPolygonAngles.sumOfAngles(159));
	}

	@Test
	public void test158() { 
		assertEquals(28440, SumOfPolygonAngles.sumOfAngles(160));
	}

	@Test
	public void test159() { 
		assertEquals(28620, SumOfPolygonAngles.sumOfAngles(161));
	}

	@Test
	public void test160() { 
		assertEquals(28800, SumOfPolygonAngles.sumOfAngles(162));
	}

	@Test
	public void test161() { 
		assertEquals(28980, SumOfPolygonAngles.sumOfAngles(163));
	}

	@Test
	public void test162() { 
		assertEquals(29160, SumOfPolygonAngles.sumOfAngles(164));
	}

	@Test
	public void test163() { 
		assertEquals(29340, SumOfPolygonAngles.sumOfAngles(165));
	}

	@Test
	public void test164() { 
		assertEquals(29520, SumOfPolygonAngles.sumOfAngles(166));
	}

	@Test
	public void test165() { 
		assertEquals(29700, SumOfPolygonAngles.sumOfAngles(167));
	}

	@Test
	public void test166() { 
		assertEquals(29880, SumOfPolygonAngles.sumOfAngles(168));
	}

	@Test
	public void test167() { 
		assertEquals(30060, SumOfPolygonAngles.sumOfAngles(169));
	}

	@Test
	public void test168() { 
		assertEquals(30240, SumOfPolygonAngles.sumOfAngles(170));
	}

	@Test
	public void test169() { 
		assertEquals(30420, SumOfPolygonAngles.sumOfAngles(171));
	}

	@Test
	public void test170() { 
		assertEquals(30600, SumOfPolygonAngles.sumOfAngles(172));
	}

	@Test
	public void test171() { 
		assertEquals(30780, SumOfPolygonAngles.sumOfAngles(173));
	}

	@Test
	public void test172() { 
		assertEquals(30960, SumOfPolygonAngles.sumOfAngles(174));
	}

	@Test
	public void test173() { 
		assertEquals(31140, SumOfPolygonAngles.sumOfAngles(175));
	}

	@Test
	public void test174() { 
		assertEquals(31320, SumOfPolygonAngles.sumOfAngles(176));
	}

	@Test
	public void test175() { 
		assertEquals(31500, SumOfPolygonAngles.sumOfAngles(177));
	}

	@Test
	public void test176() { 
		assertEquals(31680, SumOfPolygonAngles.sumOfAngles(178));
	}

	@Test
	public void test177() { 
		assertEquals(31860, SumOfPolygonAngles.sumOfAngles(179));
	}

	@Test
	public void test178() { 
		assertEquals(32040, SumOfPolygonAngles.sumOfAngles(180));
	}

	@Test
	public void test179() { 
		assertEquals(32220, SumOfPolygonAngles.sumOfAngles(181));
	}

	@Test
	public void test180() { 
		assertEquals(32400, SumOfPolygonAngles.sumOfAngles(182));
	}

	@Test
	public void test181() { 
		assertEquals(32580, SumOfPolygonAngles.sumOfAngles(183));
	}

	@Test
	public void test182() { 
		assertEquals(32760, SumOfPolygonAngles.sumOfAngles(184));
	}

	@Test
	public void test183() { 
		assertEquals(32940, SumOfPolygonAngles.sumOfAngles(185));
	}

	@Test
	public void test184() { 
		assertEquals(33120, SumOfPolygonAngles.sumOfAngles(186));
	}

	@Test
	public void test185() { 
		assertEquals(33300, SumOfPolygonAngles.sumOfAngles(187));
	}

	@Test
	public void test186() { 
		assertEquals(33480, SumOfPolygonAngles.sumOfAngles(188));
	}

	@Test
	public void test187() { 
		assertEquals(33660, SumOfPolygonAngles.sumOfAngles(189));
	}

	@Test
	public void test188() { 
		assertEquals(33840, SumOfPolygonAngles.sumOfAngles(190));
	}

	@Test
	public void test189() { 
		assertEquals(34020, SumOfPolygonAngles.sumOfAngles(191));
	}

	@Test
	public void test190() { 
		assertEquals(34200, SumOfPolygonAngles.sumOfAngles(192));
	}

	@Test
	public void test191() { 
		assertEquals(34380, SumOfPolygonAngles.sumOfAngles(193));
	}

	@Test
	public void test192() { 
		assertEquals(34560, SumOfPolygonAngles.sumOfAngles(194));
	}

	@Test
	public void test193() { 
		assertEquals(34740, SumOfPolygonAngles.sumOfAngles(195));
	}

	@Test
	public void test194() { 
		assertEquals(34920, SumOfPolygonAngles.sumOfAngles(196));
	}

	@Test
	public void test195() { 
		assertEquals(35100, SumOfPolygonAngles.sumOfAngles(197));
	}

	@Test
	public void test196() { 
		assertEquals(35280, SumOfPolygonAngles.sumOfAngles(198));
	}

	@Test
	public void test197() { 
		assertEquals(35460, SumOfPolygonAngles.sumOfAngles(199));
	}

	@Test
	public void test198() { 
		assertEquals(35640, SumOfPolygonAngles.sumOfAngles(200));
	}

	@Test
	public void test199() { 
		assertEquals(35820, SumOfPolygonAngles.sumOfAngles(201));
	}

	@Test
	public void test200() { 
		assertEquals(36000, SumOfPolygonAngles.sumOfAngles(202));
	}

	@Test
	public void test201() { 
		assertEquals(36180, SumOfPolygonAngles.sumOfAngles(203));
	}

	@Test
	public void test202() { 
		assertEquals(36360, SumOfPolygonAngles.sumOfAngles(204));
	}

	@Test
	public void test203() { 
		assertEquals(36540, SumOfPolygonAngles.sumOfAngles(205));
	}

	@Test
	public void test204() { 
		assertEquals(36720, SumOfPolygonAngles.sumOfAngles(206));
	}

	@Test
	public void test205() { 
		assertEquals(36900, SumOfPolygonAngles.sumOfAngles(207));
	}

	@Test
	public void test206() { 
		assertEquals(37080, SumOfPolygonAngles.sumOfAngles(208));
	}

	@Test
	public void test207() { 
		assertEquals(37260, SumOfPolygonAngles.sumOfAngles(209));
	}

	@Test
	public void test208() { 
		assertEquals(37440, SumOfPolygonAngles.sumOfAngles(210));
	}

	@Test
	public void test209() { 
		assertEquals(37620, SumOfPolygonAngles.sumOfAngles(211));
	}

	@Test
	public void test210() { 
		assertEquals(37800, SumOfPolygonAngles.sumOfAngles(212));
	}

	@Test
	public void test211() { 
		assertEquals(37980, SumOfPolygonAngles.sumOfAngles(213));
	}

	@Test
	public void test212() { 
		assertEquals(38160, SumOfPolygonAngles.sumOfAngles(214));
	}

	@Test
	public void test213() { 
		assertEquals(38340, SumOfPolygonAngles.sumOfAngles(215));
	}

	@Test
	public void test214() { 
		assertEquals(38520, SumOfPolygonAngles.sumOfAngles(216));
	}

	@Test
	public void test215() { 
		assertEquals(38700, SumOfPolygonAngles.sumOfAngles(217));
	}

	@Test
	public void test216() { 
		assertEquals(38880, SumOfPolygonAngles.sumOfAngles(218));
	}

	@Test
	public void test217() { 
		assertEquals(39060, SumOfPolygonAngles.sumOfAngles(219));
	}

	@Test
	public void test218() { 
		assertEquals(39240, SumOfPolygonAngles.sumOfAngles(220));
	}

	@Test
	public void test219() { 
		assertEquals(39420, SumOfPolygonAngles.sumOfAngles(221));
	}

	@Test
	public void test220() { 
		assertEquals(39600, SumOfPolygonAngles.sumOfAngles(222));
	}

	@Test
	public void test221() { 
		assertEquals(39780, SumOfPolygonAngles.sumOfAngles(223));
	}

	@Test
	public void test222() { 
		assertEquals(39960, SumOfPolygonAngles.sumOfAngles(224));
	}

	@Test
	public void test223() { 
		assertEquals(40140, SumOfPolygonAngles.sumOfAngles(225));
	}

	@Test
	public void test224() { 
		assertEquals(40320, SumOfPolygonAngles.sumOfAngles(226));
	}

	@Test
	public void test225() { 
		assertEquals(40500, SumOfPolygonAngles.sumOfAngles(227));
	}

	@Test
	public void test226() { 
		assertEquals(40680, SumOfPolygonAngles.sumOfAngles(228));
	}

	@Test
	public void test227() { 
		assertEquals(40860, SumOfPolygonAngles.sumOfAngles(229));
	}

	@Test
	public void test228() { 
		assertEquals(41040, SumOfPolygonAngles.sumOfAngles(230));
	}

	@Test
	public void test229() { 
		assertEquals(41220, SumOfPolygonAngles.sumOfAngles(231));
	}

	@Test
	public void test230() { 
		assertEquals(41400, SumOfPolygonAngles.sumOfAngles(232));
	}

	@Test
	public void test231() { 
		assertEquals(41580, SumOfPolygonAngles.sumOfAngles(233));
	}

	@Test
	public void test232() { 
		assertEquals(41760, SumOfPolygonAngles.sumOfAngles(234));
	}

	@Test
	public void test233() { 
		assertEquals(41940, SumOfPolygonAngles.sumOfAngles(235));
	}

	@Test
	public void test234() { 
		assertEquals(42120, SumOfPolygonAngles.sumOfAngles(236));
	}

	@Test
	public void test235() { 
		assertEquals(42300, SumOfPolygonAngles.sumOfAngles(237));
	}

	@Test
	public void test236() { 
		assertEquals(42480, SumOfPolygonAngles.sumOfAngles(238));
	}

	@Test
	public void test237() { 
		assertEquals(42660, SumOfPolygonAngles.sumOfAngles(239));
	}

	@Test
	public void test238() { 
		assertEquals(42840, SumOfPolygonAngles.sumOfAngles(240));
	}

	@Test
	public void test239() { 
		assertEquals(43020, SumOfPolygonAngles.sumOfAngles(241));
	}

	@Test
	public void test240() { 
		assertEquals(43200, SumOfPolygonAngles.sumOfAngles(242));
	}

	@Test
	public void test241() { 
		assertEquals(43380, SumOfPolygonAngles.sumOfAngles(243));
	}

	@Test
	public void test242() { 
		assertEquals(43560, SumOfPolygonAngles.sumOfAngles(244));
	}

	@Test
	public void test243() { 
		assertEquals(43740, SumOfPolygonAngles.sumOfAngles(245));
	}

	@Test
	public void test244() { 
		assertEquals(43920, SumOfPolygonAngles.sumOfAngles(246));
	}

	@Test
	public void test245() { 
		assertEquals(44100, SumOfPolygonAngles.sumOfAngles(247));
	}

	@Test
	public void test246() { 
		assertEquals(44280, SumOfPolygonAngles.sumOfAngles(248));
	}

	@Test
	public void test247() { 
		assertEquals(44460, SumOfPolygonAngles.sumOfAngles(249));
	}

	@Test
	public void test248() { 
		assertEquals(44640, SumOfPolygonAngles.sumOfAngles(250));
	}

	@Test
	public void test249() { 
		assertEquals(44820, SumOfPolygonAngles.sumOfAngles(251));
	}

	@Test
	public void test250() { 
		assertEquals(45000, SumOfPolygonAngles.sumOfAngles(252));
	}

	@Test
	public void test251() { 
		assertEquals(45180, SumOfPolygonAngles.sumOfAngles(253));
	}

	@Test
	public void test252() { 
		assertEquals(45360, SumOfPolygonAngles.sumOfAngles(254));
	}

	@Test
	public void test253() { 
		assertEquals(45540, SumOfPolygonAngles.sumOfAngles(255));
	}

	@Test
	public void test254() { 
		assertEquals(45720, SumOfPolygonAngles.sumOfAngles(256));
	}

	@Test
	public void test255() { 
		assertEquals(45900, SumOfPolygonAngles.sumOfAngles(257));
	}

	@Test
	public void test256() { 
		assertEquals(46080, SumOfPolygonAngles.sumOfAngles(258));
	}

	@Test
	public void test257() { 
		assertEquals(46260, SumOfPolygonAngles.sumOfAngles(259));
	}

	@Test
	public void test258() { 
		assertEquals(46440, SumOfPolygonAngles.sumOfAngles(260));
	}

	@Test
	public void test259() { 
		assertEquals(46620, SumOfPolygonAngles.sumOfAngles(261));
	}

	@Test
	public void test260() { 
		assertEquals(46800, SumOfPolygonAngles.sumOfAngles(262));
	}

	@Test
	public void test261() { 
		assertEquals(46980, SumOfPolygonAngles.sumOfAngles(263));
	}

	@Test
	public void test262() { 
		assertEquals(47160, SumOfPolygonAngles.sumOfAngles(264));
	}

	@Test
	public void test263() { 
		assertEquals(47340, SumOfPolygonAngles.sumOfAngles(265));
	}

	@Test
	public void test264() { 
		assertEquals(47520, SumOfPolygonAngles.sumOfAngles(266));
	}

	@Test
	public void test265() { 
		assertEquals(47700, SumOfPolygonAngles.sumOfAngles(267));
	}

	@Test
	public void test266() { 
		assertEquals(47880, SumOfPolygonAngles.sumOfAngles(268));
	}

	@Test
	public void test267() { 
		assertEquals(48060, SumOfPolygonAngles.sumOfAngles(269));
	}

	@Test
	public void test268() { 
		assertEquals(48240, SumOfPolygonAngles.sumOfAngles(270));
	}

	@Test
	public void test269() { 
		assertEquals(48420, SumOfPolygonAngles.sumOfAngles(271));
	}

	@Test
	public void test270() { 
		assertEquals(48600, SumOfPolygonAngles.sumOfAngles(272));
	}

	@Test
	public void test271() { 
		assertEquals(48780, SumOfPolygonAngles.sumOfAngles(273));
	}

	@Test
	public void test272() { 
		assertEquals(48960, SumOfPolygonAngles.sumOfAngles(274));
	}

	@Test
	public void test273() { 
		assertEquals(49140, SumOfPolygonAngles.sumOfAngles(275));
	}

	@Test
	public void test274() { 
		assertEquals(49320, SumOfPolygonAngles.sumOfAngles(276));
	}

	@Test
	public void test275() { 
		assertEquals(49500, SumOfPolygonAngles.sumOfAngles(277));
	}

	@Test
	public void test276() { 
		assertEquals(49680, SumOfPolygonAngles.sumOfAngles(278));
	}

	@Test
	public void test277() { 
		assertEquals(49860, SumOfPolygonAngles.sumOfAngles(279));
	}

	@Test
	public void test278() { 
		assertEquals(50040, SumOfPolygonAngles.sumOfAngles(280));
	}

	@Test
	public void test279() { 
		assertEquals(50220, SumOfPolygonAngles.sumOfAngles(281));
	}

	@Test
	public void test280() { 
		assertEquals(50400, SumOfPolygonAngles.sumOfAngles(282));
	}

	@Test
	public void test281() { 
		assertEquals(50580, SumOfPolygonAngles.sumOfAngles(283));
	}

	@Test
	public void test282() { 
		assertEquals(50760, SumOfPolygonAngles.sumOfAngles(284));
	}

	@Test
	public void test283() { 
		assertEquals(50940, SumOfPolygonAngles.sumOfAngles(285));
	}

	@Test
	public void test284() { 
		assertEquals(51120, SumOfPolygonAngles.sumOfAngles(286));
	}

	@Test
	public void test285() { 
		assertEquals(51300, SumOfPolygonAngles.sumOfAngles(287));
	}

	@Test
	public void test286() { 
		assertEquals(51480, SumOfPolygonAngles.sumOfAngles(288));
	}

	@Test
	public void test287() { 
		assertEquals(51660, SumOfPolygonAngles.sumOfAngles(289));
	}

	@Test
	public void test288() { 
		assertEquals(51840, SumOfPolygonAngles.sumOfAngles(290));
	}

	@Test
	public void test289() { 
		assertEquals(52020, SumOfPolygonAngles.sumOfAngles(291));
	}

	@Test
	public void test290() { 
		assertEquals(52200, SumOfPolygonAngles.sumOfAngles(292));
	}

	@Test
	public void test291() { 
		assertEquals(52380, SumOfPolygonAngles.sumOfAngles(293));
	}

	@Test
	public void test292() { 
		assertEquals(52560, SumOfPolygonAngles.sumOfAngles(294));
	}

	@Test
	public void test293() { 
		assertEquals(52740, SumOfPolygonAngles.sumOfAngles(295));
	}

	@Test
	public void test294() { 
		assertEquals(52920, SumOfPolygonAngles.sumOfAngles(296));
	}

	@Test
	public void test295() { 
		assertEquals(53100, SumOfPolygonAngles.sumOfAngles(297));
	}

	@Test
	public void test296() { 
		assertEquals(53280, SumOfPolygonAngles.sumOfAngles(298));
	}

	@Test
	public void test297() { 
		assertEquals(53460, SumOfPolygonAngles.sumOfAngles(299));
	}

	@Test
	public void test298() { 
		assertEquals(53640, SumOfPolygonAngles.sumOfAngles(300));
	}

	@Test
	public void test299() { 
		assertEquals(53820, SumOfPolygonAngles.sumOfAngles(301));
	}

	@Test
	public void test300() { 
		assertEquals(54000, SumOfPolygonAngles.sumOfAngles(302));
	}

	@Test
	public void test301() { 
		assertEquals(54180, SumOfPolygonAngles.sumOfAngles(303));
	}

	@Test
	public void test302() { 
		assertEquals(54360, SumOfPolygonAngles.sumOfAngles(304));
	}

	@Test
	public void test303() { 
		assertEquals(54540, SumOfPolygonAngles.sumOfAngles(305));
	}

	@Test
	public void test304() { 
		assertEquals(54720, SumOfPolygonAngles.sumOfAngles(306));
	}

	@Test
	public void test305() { 
		assertEquals(54900, SumOfPolygonAngles.sumOfAngles(307));
	}

	@Test
	public void test306() { 
		assertEquals(55080, SumOfPolygonAngles.sumOfAngles(308));
	}

	@Test
	public void test307() { 
		assertEquals(55260, SumOfPolygonAngles.sumOfAngles(309));
	}

	@Test
	public void test308() { 
		assertEquals(55440, SumOfPolygonAngles.sumOfAngles(310));
	}

	@Test
	public void test309() { 
		assertEquals(55620, SumOfPolygonAngles.sumOfAngles(311));
	}

	@Test
	public void test310() { 
		assertEquals(55800, SumOfPolygonAngles.sumOfAngles(312));
	}

	@Test
	public void test311() { 
		assertEquals(55980, SumOfPolygonAngles.sumOfAngles(313));
	}

	@Test
	public void test312() { 
		assertEquals(56160, SumOfPolygonAngles.sumOfAngles(314));
	}

	@Test
	public void test313() { 
		assertEquals(56340, SumOfPolygonAngles.sumOfAngles(315));
	}

	@Test
	public void test314() { 
		assertEquals(56520, SumOfPolygonAngles.sumOfAngles(316));
	}

	@Test
	public void test315() { 
		assertEquals(56700, SumOfPolygonAngles.sumOfAngles(317));
	}

	@Test
	public void test316() { 
		assertEquals(56880, SumOfPolygonAngles.sumOfAngles(318));
	}

	@Test
	public void test317() { 
		assertEquals(57060, SumOfPolygonAngles.sumOfAngles(319));
	}

	@Test
	public void test318() { 
		assertEquals(57240, SumOfPolygonAngles.sumOfAngles(320));
	}

	@Test
	public void test319() { 
		assertEquals(57420, SumOfPolygonAngles.sumOfAngles(321));
	}

	@Test
	public void test320() { 
		assertEquals(57600, SumOfPolygonAngles.sumOfAngles(322));
	}

	@Test
	public void test321() { 
		assertEquals(57780, SumOfPolygonAngles.sumOfAngles(323));
	}

	@Test
	public void test322() { 
		assertEquals(57960, SumOfPolygonAngles.sumOfAngles(324));
	}

	@Test
	public void test323() { 
		assertEquals(58140, SumOfPolygonAngles.sumOfAngles(325));
	}

	@Test
	public void test324() { 
		assertEquals(58320, SumOfPolygonAngles.sumOfAngles(326));
	}

	@Test
	public void test325() { 
		assertEquals(58500, SumOfPolygonAngles.sumOfAngles(327));
	}

	@Test
	public void test326() { 
		assertEquals(58680, SumOfPolygonAngles.sumOfAngles(328));
	}

	@Test
	public void test327() { 
		assertEquals(58860, SumOfPolygonAngles.sumOfAngles(329));
	}

	@Test
	public void test328() { 
		assertEquals(59040, SumOfPolygonAngles.sumOfAngles(330));
	}

	@Test
	public void test329() { 
		assertEquals(59220, SumOfPolygonAngles.sumOfAngles(331));
	}

	@Test
	public void test330() { 
		assertEquals(59400, SumOfPolygonAngles.sumOfAngles(332));
	}

	@Test
	public void test331() { 
		assertEquals(59580, SumOfPolygonAngles.sumOfAngles(333));
	}

	@Test
	public void test332() { 
		assertEquals(59760, SumOfPolygonAngles.sumOfAngles(334));
	}

	@Test
	public void test333() { 
		assertEquals(59940, SumOfPolygonAngles.sumOfAngles(335));
	}

	@Test
	public void test334() { 
		assertEquals(60120, SumOfPolygonAngles.sumOfAngles(336));
	}

	@Test
	public void test335() { 
		assertEquals(60300, SumOfPolygonAngles.sumOfAngles(337));
	}

	@Test
	public void test336() { 
		assertEquals(60480, SumOfPolygonAngles.sumOfAngles(338));
	}

	@Test
	public void test337() { 
		assertEquals(60660, SumOfPolygonAngles.sumOfAngles(339));
	}

	@Test
	public void test338() { 
		assertEquals(60840, SumOfPolygonAngles.sumOfAngles(340));
	}

	@Test
	public void test339() { 
		assertEquals(61020, SumOfPolygonAngles.sumOfAngles(341));
	}

	@Test
	public void test340() { 
		assertEquals(61200, SumOfPolygonAngles.sumOfAngles(342));
	}

	@Test
	public void test341() { 
		assertEquals(61380, SumOfPolygonAngles.sumOfAngles(343));
	}

	@Test
	public void test342() { 
		assertEquals(61560, SumOfPolygonAngles.sumOfAngles(344));
	}

	@Test
	public void test343() { 
		assertEquals(61740, SumOfPolygonAngles.sumOfAngles(345));
	}

	@Test
	public void test344() { 
		assertEquals(61920, SumOfPolygonAngles.sumOfAngles(346));
	}

	@Test
	public void test345() { 
		assertEquals(62100, SumOfPolygonAngles.sumOfAngles(347));
	}

	@Test
	public void test346() { 
		assertEquals(62280, SumOfPolygonAngles.sumOfAngles(348));
	}

	@Test
	public void test347() { 
		assertEquals(62460, SumOfPolygonAngles.sumOfAngles(349));
	}

	@Test
	public void test348() { 
		assertEquals(62640, SumOfPolygonAngles.sumOfAngles(350));
	}

	@Test
	public void test349() { 
		assertEquals(62820, SumOfPolygonAngles.sumOfAngles(351));
	}

	@Test
	public void test350() { 
		assertEquals(63000, SumOfPolygonAngles.sumOfAngles(352));
	}

	@Test
	public void test351() { 
		assertEquals(63180, SumOfPolygonAngles.sumOfAngles(353));
	}

	@Test
	public void test352() { 
		assertEquals(63360, SumOfPolygonAngles.sumOfAngles(354));
	}

	@Test
	public void test353() { 
		assertEquals(63540, SumOfPolygonAngles.sumOfAngles(355));
	}

	@Test
	public void test354() { 
		assertEquals(63720, SumOfPolygonAngles.sumOfAngles(356));
	}

	@Test
	public void test355() { 
		assertEquals(63900, SumOfPolygonAngles.sumOfAngles(357));
	}

	@Test
	public void test356() { 
		assertEquals(64080, SumOfPolygonAngles.sumOfAngles(358));
	}

	@Test
	public void test357() { 
		assertEquals(64260, SumOfPolygonAngles.sumOfAngles(359));
	}

	@Test
	public void test358() { 
		assertEquals(64440, SumOfPolygonAngles.sumOfAngles(360));
	}

	@Test
	public void test359() { 
		assertEquals(64620, SumOfPolygonAngles.sumOfAngles(361));
	}

	@Test
	public void test360() { 
		assertEquals(64800, SumOfPolygonAngles.sumOfAngles(362));
	}

	@Test
	public void test361() { 
		assertEquals(64980, SumOfPolygonAngles.sumOfAngles(363));
	}

	@Test
	public void test362() { 
		assertEquals(65160, SumOfPolygonAngles.sumOfAngles(364));
	}

	@Test
	public void test363() { 
		assertEquals(65340, SumOfPolygonAngles.sumOfAngles(365));
	}

	@Test
	public void test364() { 
		assertEquals(65520, SumOfPolygonAngles.sumOfAngles(366));
	}

	@Test
	public void test365() { 
		assertEquals(65700, SumOfPolygonAngles.sumOfAngles(367));
	}

	@Test
	public void test366() { 
		assertEquals(65880, SumOfPolygonAngles.sumOfAngles(368));
	}

	@Test
	public void test367() { 
		assertEquals(66060, SumOfPolygonAngles.sumOfAngles(369));
	}

	@Test
	public void test368() { 
		assertEquals(66240, SumOfPolygonAngles.sumOfAngles(370));
	}

	@Test
	public void test369() { 
		assertEquals(66420, SumOfPolygonAngles.sumOfAngles(371));
	}

	@Test
	public void test370() { 
		assertEquals(66600, SumOfPolygonAngles.sumOfAngles(372));
	}

	@Test
	public void test371() { 
		assertEquals(66780, SumOfPolygonAngles.sumOfAngles(373));
	}

	@Test
	public void test372() { 
		assertEquals(66960, SumOfPolygonAngles.sumOfAngles(374));
	}

	@Test
	public void test373() { 
		assertEquals(67140, SumOfPolygonAngles.sumOfAngles(375));
	}

	@Test
	public void test374() { 
		assertEquals(67320, SumOfPolygonAngles.sumOfAngles(376));
	}

	@Test
	public void test375() { 
		assertEquals(67500, SumOfPolygonAngles.sumOfAngles(377));
	}

	@Test
	public void test376() { 
		assertEquals(67680, SumOfPolygonAngles.sumOfAngles(378));
	}

	@Test
	public void test377() { 
		assertEquals(67860, SumOfPolygonAngles.sumOfAngles(379));
	}

	@Test
	public void test378() { 
		assertEquals(68040, SumOfPolygonAngles.sumOfAngles(380));
	}

	@Test
	public void test379() { 
		assertEquals(68220, SumOfPolygonAngles.sumOfAngles(381));
	}

	@Test
	public void test380() { 
		assertEquals(68400, SumOfPolygonAngles.sumOfAngles(382));
	}

	@Test
	public void test381() { 
		assertEquals(68580, SumOfPolygonAngles.sumOfAngles(383));
	}

	@Test
	public void test382() { 
		assertEquals(68760, SumOfPolygonAngles.sumOfAngles(384));
	}

	@Test
	public void test383() { 
		assertEquals(68940, SumOfPolygonAngles.sumOfAngles(385));
	}

	@Test
	public void test384() { 
		assertEquals(69120, SumOfPolygonAngles.sumOfAngles(386));
	}

	@Test
	public void test385() { 
		assertEquals(69300, SumOfPolygonAngles.sumOfAngles(387));
	}

	@Test
	public void test386() { 
		assertEquals(69480, SumOfPolygonAngles.sumOfAngles(388));
	}

	@Test
	public void test387() { 
		assertEquals(69660, SumOfPolygonAngles.sumOfAngles(389));
	}

	@Test
	public void test388() { 
		assertEquals(69840, SumOfPolygonAngles.sumOfAngles(390));
	}

	@Test
	public void test389() { 
		assertEquals(70020, SumOfPolygonAngles.sumOfAngles(391));
	}

	@Test
	public void test390() { 
		assertEquals(70200, SumOfPolygonAngles.sumOfAngles(392));
	}

	@Test
	public void test391() { 
		assertEquals(70380, SumOfPolygonAngles.sumOfAngles(393));
	}

	@Test
	public void test392() { 
		assertEquals(70560, SumOfPolygonAngles.sumOfAngles(394));
	}

	@Test
	public void test393() { 
		assertEquals(70740, SumOfPolygonAngles.sumOfAngles(395));
	}

	@Test
	public void test394() { 
		assertEquals(70920, SumOfPolygonAngles.sumOfAngles(396));
	}

	@Test
	public void test395() { 
		assertEquals(71100, SumOfPolygonAngles.sumOfAngles(397));
	}

	@Test
	public void test396() { 
		assertEquals(71280, SumOfPolygonAngles.sumOfAngles(398));
	}

	@Test
	public void test397() { 
		assertEquals(71460, SumOfPolygonAngles.sumOfAngles(399));
	}

	@Test
	public void test398() { 
		assertEquals(71640, SumOfPolygonAngles.sumOfAngles(400));
	}

	@Test
	public void test399() { 
		assertEquals(71820, SumOfPolygonAngles.sumOfAngles(401));
	}

	@Test
	public void test400() { 
		assertEquals(72000, SumOfPolygonAngles.sumOfAngles(402));
	}

	@Test
	public void test401() { 
		assertEquals(72180, SumOfPolygonAngles.sumOfAngles(403));
	}

	@Test
	public void test402() { 
		assertEquals(72360, SumOfPolygonAngles.sumOfAngles(404));
	}

	@Test
	public void test403() { 
		assertEquals(72540, SumOfPolygonAngles.sumOfAngles(405));
	}

	@Test
	public void test404() { 
		assertEquals(72720, SumOfPolygonAngles.sumOfAngles(406));
	}

	@Test
	public void test405() { 
		assertEquals(72900, SumOfPolygonAngles.sumOfAngles(407));
	}

	@Test
	public void test406() { 
		assertEquals(73080, SumOfPolygonAngles.sumOfAngles(408));
	}

	@Test
	public void test407() { 
		assertEquals(73260, SumOfPolygonAngles.sumOfAngles(409));
	}

	@Test
	public void test408() { 
		assertEquals(73440, SumOfPolygonAngles.sumOfAngles(410));
	}

	@Test
	public void test409() { 
		assertEquals(73620, SumOfPolygonAngles.sumOfAngles(411));
	}

	@Test
	public void test410() { 
		assertEquals(73800, SumOfPolygonAngles.sumOfAngles(412));
	}

	@Test
	public void test411() { 
		assertEquals(73980, SumOfPolygonAngles.sumOfAngles(413));
	}

	@Test
	public void test412() { 
		assertEquals(74160, SumOfPolygonAngles.sumOfAngles(414));
	}

	@Test
	public void test413() { 
		assertEquals(74340, SumOfPolygonAngles.sumOfAngles(415));
	}

	@Test
	public void test414() { 
		assertEquals(74520, SumOfPolygonAngles.sumOfAngles(416));
	}

	@Test
	public void test415() { 
		assertEquals(74700, SumOfPolygonAngles.sumOfAngles(417));
	}

	@Test
	public void test416() { 
		assertEquals(74880, SumOfPolygonAngles.sumOfAngles(418));
	}

	@Test
	public void test417() { 
		assertEquals(75060, SumOfPolygonAngles.sumOfAngles(419));
	}

	@Test
	public void test418() { 
		assertEquals(75240, SumOfPolygonAngles.sumOfAngles(420));
	}

	@Test
	public void test419() { 
		assertEquals(75420, SumOfPolygonAngles.sumOfAngles(421));
	}

	@Test
	public void test420() { 
		assertEquals(75600, SumOfPolygonAngles.sumOfAngles(422));
	}

	@Test
	public void test421() { 
		assertEquals(75780, SumOfPolygonAngles.sumOfAngles(423));
	}

	@Test
	public void test422() { 
		assertEquals(75960, SumOfPolygonAngles.sumOfAngles(424));
	}

	@Test
	public void test423() { 
		assertEquals(76140, SumOfPolygonAngles.sumOfAngles(425));
	}

	@Test
	public void test424() { 
		assertEquals(76320, SumOfPolygonAngles.sumOfAngles(426));
	}

	@Test
	public void test425() { 
		assertEquals(76500, SumOfPolygonAngles.sumOfAngles(427));
	}

	@Test
	public void test426() { 
		assertEquals(76680, SumOfPolygonAngles.sumOfAngles(428));
	}

	@Test
	public void test427() { 
		assertEquals(76860, SumOfPolygonAngles.sumOfAngles(429));
	}

	@Test
	public void test428() { 
		assertEquals(77040, SumOfPolygonAngles.sumOfAngles(430));
	}

	@Test
	public void test429() { 
		assertEquals(77220, SumOfPolygonAngles.sumOfAngles(431));
	}

	@Test
	public void test430() { 
		assertEquals(77400, SumOfPolygonAngles.sumOfAngles(432));
	}

	@Test
	public void test431() { 
		assertEquals(77580, SumOfPolygonAngles.sumOfAngles(433));
	}

	@Test
	public void test432() { 
		assertEquals(77760, SumOfPolygonAngles.sumOfAngles(434));
	}

	@Test
	public void test433() { 
		assertEquals(77940, SumOfPolygonAngles.sumOfAngles(435));
	}

	@Test
	public void test434() { 
		assertEquals(78120, SumOfPolygonAngles.sumOfAngles(436));
	}

	@Test
	public void test435() { 
		assertEquals(78300, SumOfPolygonAngles.sumOfAngles(437));
	}

	@Test
	public void test436() { 
		assertEquals(78480, SumOfPolygonAngles.sumOfAngles(438));
	}

	@Test
	public void test437() { 
		assertEquals(78660, SumOfPolygonAngles.sumOfAngles(439));
	}

	@Test
	public void test438() { 
		assertEquals(78840, SumOfPolygonAngles.sumOfAngles(440));
	}

	@Test
	public void test439() { 
		assertEquals(79020, SumOfPolygonAngles.sumOfAngles(441));
	}

	@Test
	public void test440() { 
		assertEquals(79200, SumOfPolygonAngles.sumOfAngles(442));
	}

	@Test
	public void test441() { 
		assertEquals(79380, SumOfPolygonAngles.sumOfAngles(443));
	}

	@Test
	public void test442() { 
		assertEquals(79560, SumOfPolygonAngles.sumOfAngles(444));
	}

	@Test
	public void test443() { 
		assertEquals(79740, SumOfPolygonAngles.sumOfAngles(445));
	}

	@Test
	public void test444() { 
		assertEquals(79920, SumOfPolygonAngles.sumOfAngles(446));
	}

	@Test
	public void test445() { 
		assertEquals(80100, SumOfPolygonAngles.sumOfAngles(447));
	}

	@Test
	public void test446() { 
		assertEquals(80280, SumOfPolygonAngles.sumOfAngles(448));
	}

	@Test
	public void test447() { 
		assertEquals(80460, SumOfPolygonAngles.sumOfAngles(449));
	}

	@Test
	public void test448() { 
		assertEquals(80640, SumOfPolygonAngles.sumOfAngles(450));
	}

	@Test
	public void test449() { 
		assertEquals(80820, SumOfPolygonAngles.sumOfAngles(451));
	}

	@Test
	public void test450() { 
		assertEquals(81000, SumOfPolygonAngles.sumOfAngles(452));
	}

	@Test
	public void test451() { 
		assertEquals(81180, SumOfPolygonAngles.sumOfAngles(453));
	}

	@Test
	public void test452() { 
		assertEquals(81360, SumOfPolygonAngles.sumOfAngles(454));
	}

	@Test
	public void test453() { 
		assertEquals(81540, SumOfPolygonAngles.sumOfAngles(455));
	}

	@Test
	public void test454() { 
		assertEquals(81720, SumOfPolygonAngles.sumOfAngles(456));
	}

	@Test
	public void test455() { 
		assertEquals(81900, SumOfPolygonAngles.sumOfAngles(457));
	}

	@Test
	public void test456() { 
		assertEquals(82080, SumOfPolygonAngles.sumOfAngles(458));
	}

	@Test
	public void test457() { 
		assertEquals(82260, SumOfPolygonAngles.sumOfAngles(459));
	}

	@Test
	public void test458() { 
		assertEquals(82440, SumOfPolygonAngles.sumOfAngles(460));
	}

	@Test
	public void test459() { 
		assertEquals(82620, SumOfPolygonAngles.sumOfAngles(461));
	}

	@Test
	public void test460() { 
		assertEquals(82800, SumOfPolygonAngles.sumOfAngles(462));
	}

	@Test
	public void test461() { 
		assertEquals(82980, SumOfPolygonAngles.sumOfAngles(463));
	}

	@Test
	public void test462() { 
		assertEquals(83160, SumOfPolygonAngles.sumOfAngles(464));
	}

	@Test
	public void test463() { 
		assertEquals(83340, SumOfPolygonAngles.sumOfAngles(465));
	}

	@Test
	public void test464() { 
		assertEquals(83520, SumOfPolygonAngles.sumOfAngles(466));
	}

	@Test
	public void test465() { 
		assertEquals(83700, SumOfPolygonAngles.sumOfAngles(467));
	}

	@Test
	public void test466() { 
		assertEquals(83880, SumOfPolygonAngles.sumOfAngles(468));
	}

	@Test
	public void test467() { 
		assertEquals(84060, SumOfPolygonAngles.sumOfAngles(469));
	}

	@Test
	public void test468() { 
		assertEquals(84240, SumOfPolygonAngles.sumOfAngles(470));
	}

	@Test
	public void test469() { 
		assertEquals(84420, SumOfPolygonAngles.sumOfAngles(471));
	}

	@Test
	public void test470() { 
		assertEquals(84600, SumOfPolygonAngles.sumOfAngles(472));
	}

	@Test
	public void test471() { 
		assertEquals(84780, SumOfPolygonAngles.sumOfAngles(473));
	}

	@Test
	public void test472() { 
		assertEquals(84960, SumOfPolygonAngles.sumOfAngles(474));
	}

	@Test
	public void test473() { 
		assertEquals(85140, SumOfPolygonAngles.sumOfAngles(475));
	}

	@Test
	public void test474() { 
		assertEquals(85320, SumOfPolygonAngles.sumOfAngles(476));
	}

	@Test
	public void test475() { 
		assertEquals(85500, SumOfPolygonAngles.sumOfAngles(477));
	}

	@Test
	public void test476() { 
		assertEquals(85680, SumOfPolygonAngles.sumOfAngles(478));
	}

	@Test
	public void test477() { 
		assertEquals(85860, SumOfPolygonAngles.sumOfAngles(479));
	}

	@Test
	public void test478() { 
		assertEquals(86040, SumOfPolygonAngles.sumOfAngles(480));
	}

	@Test
	public void test479() { 
		assertEquals(86220, SumOfPolygonAngles.sumOfAngles(481));
	}

	@Test
	public void test480() { 
		assertEquals(86400, SumOfPolygonAngles.sumOfAngles(482));
	}

	@Test
	public void test481() { 
		assertEquals(86580, SumOfPolygonAngles.sumOfAngles(483));
	}

	@Test
	public void test482() { 
		assertEquals(86760, SumOfPolygonAngles.sumOfAngles(484));
	}

	@Test
	public void test483() { 
		assertEquals(86940, SumOfPolygonAngles.sumOfAngles(485));
	}

	@Test
	public void test484() { 
		assertEquals(87120, SumOfPolygonAngles.sumOfAngles(486));
	}

	@Test
	public void test485() { 
		assertEquals(87300, SumOfPolygonAngles.sumOfAngles(487));
	}

	@Test
	public void test486() { 
		assertEquals(87480, SumOfPolygonAngles.sumOfAngles(488));
	}

	@Test
	public void test487() { 
		assertEquals(87660, SumOfPolygonAngles.sumOfAngles(489));
	}

	@Test
	public void test488() { 
		assertEquals(87840, SumOfPolygonAngles.sumOfAngles(490));
	}

	@Test
	public void test489() { 
		assertEquals(88020, SumOfPolygonAngles.sumOfAngles(491));
	}

	@Test
	public void test490() { 
		assertEquals(88200, SumOfPolygonAngles.sumOfAngles(492));
	}

	@Test
	public void test491() { 
		assertEquals(88380, SumOfPolygonAngles.sumOfAngles(493));
	}

	@Test
	public void test492() { 
		assertEquals(88560, SumOfPolygonAngles.sumOfAngles(494));
	}

	@Test
	public void test493() { 
		assertEquals(88740, SumOfPolygonAngles.sumOfAngles(495));
	}

	@Test
	public void test494() { 
		assertEquals(88920, SumOfPolygonAngles.sumOfAngles(496));
	}

	@Test
	public void test495() { 
		assertEquals(89100, SumOfPolygonAngles.sumOfAngles(497));
	}

	@Test
	public void test496() { 
		assertEquals(89280, SumOfPolygonAngles.sumOfAngles(498));
	}

	@Test
	public void test497() { 
		assertEquals(89460, SumOfPolygonAngles.sumOfAngles(499));
	}

	@Test
	public void test498() { 
		assertEquals(89640, SumOfPolygonAngles.sumOfAngles(500));
	}

	@Test
	public void test499() { 
		assertEquals(89820, SumOfPolygonAngles.sumOfAngles(501));
	}

	@Test
	public void test500() { 
		assertEquals(90000, SumOfPolygonAngles.sumOfAngles(502));
	}

	@Test
	public void test501() { 
		assertEquals(90180, SumOfPolygonAngles.sumOfAngles(503));
	}

	@Test
	public void test502() { 
		assertEquals(90360, SumOfPolygonAngles.sumOfAngles(504));
	}

	@Test
	public void test503() { 
		assertEquals(90540, SumOfPolygonAngles.sumOfAngles(505));
	}

	@Test
	public void test504() { 
		assertEquals(90720, SumOfPolygonAngles.sumOfAngles(506));
	}

	@Test
	public void test505() { 
		assertEquals(90900, SumOfPolygonAngles.sumOfAngles(507));
	}

	@Test
	public void test506() { 
		assertEquals(91080, SumOfPolygonAngles.sumOfAngles(508));
	}

	@Test
	public void test507() { 
		assertEquals(91260, SumOfPolygonAngles.sumOfAngles(509));
	}

	@Test
	public void test508() { 
		assertEquals(91440, SumOfPolygonAngles.sumOfAngles(510));
	}

	@Test
	public void test509() { 
		assertEquals(91620, SumOfPolygonAngles.sumOfAngles(511));
	}

	@Test
	public void test510() { 
		assertEquals(91800, SumOfPolygonAngles.sumOfAngles(512));
	}

	@Test
	public void test511() { 
		assertEquals(91980, SumOfPolygonAngles.sumOfAngles(513));
	}

	@Test
	public void test512() { 
		assertEquals(92160, SumOfPolygonAngles.sumOfAngles(514));
	}

	@Test
	public void test513() { 
		assertEquals(92340, SumOfPolygonAngles.sumOfAngles(515));
	}

	@Test
	public void test514() { 
		assertEquals(92520, SumOfPolygonAngles.sumOfAngles(516));
	}

	@Test
	public void test515() { 
		assertEquals(92700, SumOfPolygonAngles.sumOfAngles(517));
	}

	@Test
	public void test516() { 
		assertEquals(92880, SumOfPolygonAngles.sumOfAngles(518));
	}

	@Test
	public void test517() { 
		assertEquals(93060, SumOfPolygonAngles.sumOfAngles(519));
	}

	@Test
	public void test518() { 
		assertEquals(93240, SumOfPolygonAngles.sumOfAngles(520));
	}

	@Test
	public void test519() { 
		assertEquals(93420, SumOfPolygonAngles.sumOfAngles(521));
	}

	@Test
	public void test520() { 
		assertEquals(93600, SumOfPolygonAngles.sumOfAngles(522));
	}

	@Test
	public void test521() { 
		assertEquals(93780, SumOfPolygonAngles.sumOfAngles(523));
	}

	@Test
	public void test522() { 
		assertEquals(93960, SumOfPolygonAngles.sumOfAngles(524));
	}

	@Test
	public void test523() { 
		assertEquals(94140, SumOfPolygonAngles.sumOfAngles(525));
	}

	@Test
	public void test524() { 
		assertEquals(94320, SumOfPolygonAngles.sumOfAngles(526));
	}

	@Test
	public void test525() { 
		assertEquals(94500, SumOfPolygonAngles.sumOfAngles(527));
	}

	@Test
	public void test526() { 
		assertEquals(94680, SumOfPolygonAngles.sumOfAngles(528));
	}

	@Test
	public void test527() { 
		assertEquals(94860, SumOfPolygonAngles.sumOfAngles(529));
	}

	@Test
	public void test528() { 
		assertEquals(95040, SumOfPolygonAngles.sumOfAngles(530));
	}

	@Test
	public void test529() { 
		assertEquals(95220, SumOfPolygonAngles.sumOfAngles(531));
	}

	@Test
	public void test530() { 
		assertEquals(95400, SumOfPolygonAngles.sumOfAngles(532));
	}

	@Test
	public void test531() { 
		assertEquals(95580, SumOfPolygonAngles.sumOfAngles(533));
	}

	@Test
	public void test532() { 
		assertEquals(95760, SumOfPolygonAngles.sumOfAngles(534));
	}

	@Test
	public void test533() { 
		assertEquals(95940, SumOfPolygonAngles.sumOfAngles(535));
	}

	@Test
	public void test534() { 
		assertEquals(96120, SumOfPolygonAngles.sumOfAngles(536));
	}

	@Test
	public void test535() { 
		assertEquals(96300, SumOfPolygonAngles.sumOfAngles(537));
	}

	@Test
	public void test536() { 
		assertEquals(96480, SumOfPolygonAngles.sumOfAngles(538));
	}

	@Test
	public void test537() { 
		assertEquals(96660, SumOfPolygonAngles.sumOfAngles(539));
	}

	@Test
	public void test538() { 
		assertEquals(96840, SumOfPolygonAngles.sumOfAngles(540));
	}

	@Test
	public void test539() { 
		assertEquals(97020, SumOfPolygonAngles.sumOfAngles(541));
	}

	@Test
	public void test540() { 
		assertEquals(97200, SumOfPolygonAngles.sumOfAngles(542));
	}

	@Test
	public void test541() { 
		assertEquals(97380, SumOfPolygonAngles.sumOfAngles(543));
	}

	@Test
	public void test542() { 
		assertEquals(97560, SumOfPolygonAngles.sumOfAngles(544));
	}

	@Test
	public void test543() { 
		assertEquals(97740, SumOfPolygonAngles.sumOfAngles(545));
	}

	@Test
	public void test544() { 
		assertEquals(97920, SumOfPolygonAngles.sumOfAngles(546));
	}

	@Test
	public void test545() { 
		assertEquals(98100, SumOfPolygonAngles.sumOfAngles(547));
	}

	@Test
	public void test546() { 
		assertEquals(98280, SumOfPolygonAngles.sumOfAngles(548));
	}

	@Test
	public void test547() { 
		assertEquals(98460, SumOfPolygonAngles.sumOfAngles(549));
	}

	@Test
	public void test548() { 
		assertEquals(98640, SumOfPolygonAngles.sumOfAngles(550));
	}

	@Test
	public void test549() { 
		assertEquals(98820, SumOfPolygonAngles.sumOfAngles(551));
	}

	@Test
	public void test550() { 
		assertEquals(99000, SumOfPolygonAngles.sumOfAngles(552));
	}

	@Test
	public void test551() { 
		assertEquals(99180, SumOfPolygonAngles.sumOfAngles(553));
	}

	@Test
	public void test552() { 
		assertEquals(99360, SumOfPolygonAngles.sumOfAngles(554));
	}

	@Test
	public void test553() { 
		assertEquals(99540, SumOfPolygonAngles.sumOfAngles(555));
	}

	@Test
	public void test554() { 
		assertEquals(99720, SumOfPolygonAngles.sumOfAngles(556));
	}

	@Test
	public void test555() { 
		assertEquals(99900, SumOfPolygonAngles.sumOfAngles(557));
	}

	@Test
	public void test556() { 
		assertEquals(100080, SumOfPolygonAngles.sumOfAngles(558));
	}

	@Test
	public void test557() { 
		assertEquals(100260, SumOfPolygonAngles.sumOfAngles(559));
	}

	@Test
	public void test558() { 
		assertEquals(100440, SumOfPolygonAngles.sumOfAngles(560));
	}

	@Test
	public void test559() { 
		assertEquals(100620, SumOfPolygonAngles.sumOfAngles(561));
	}

	@Test
	public void test560() { 
		assertEquals(100800, SumOfPolygonAngles.sumOfAngles(562));
	}

	@Test
	public void test561() { 
		assertEquals(100980, SumOfPolygonAngles.sumOfAngles(563));
	}

	@Test
	public void test562() { 
		assertEquals(101160, SumOfPolygonAngles.sumOfAngles(564));
	}

	@Test
	public void test563() { 
		assertEquals(101340, SumOfPolygonAngles.sumOfAngles(565));
	}

	@Test
	public void test564() { 
		assertEquals(101520, SumOfPolygonAngles.sumOfAngles(566));
	}

	@Test
	public void test565() { 
		assertEquals(101700, SumOfPolygonAngles.sumOfAngles(567));
	}

	@Test
	public void test566() { 
		assertEquals(101880, SumOfPolygonAngles.sumOfAngles(568));
	}

	@Test
	public void test567() { 
		assertEquals(102060, SumOfPolygonAngles.sumOfAngles(569));
	}

	@Test
	public void test568() { 
		assertEquals(102240, SumOfPolygonAngles.sumOfAngles(570));
	}

	@Test
	public void test569() { 
		assertEquals(102420, SumOfPolygonAngles.sumOfAngles(571));
	}

	@Test
	public void test570() { 
		assertEquals(102600, SumOfPolygonAngles.sumOfAngles(572));
	}

	@Test
	public void test571() { 
		assertEquals(102780, SumOfPolygonAngles.sumOfAngles(573));
	}

	@Test
	public void test572() { 
		assertEquals(102960, SumOfPolygonAngles.sumOfAngles(574));
	}

	@Test
	public void test573() { 
		assertEquals(103140, SumOfPolygonAngles.sumOfAngles(575));
	}

	@Test
	public void test574() { 
		assertEquals(103320, SumOfPolygonAngles.sumOfAngles(576));
	}

	@Test
	public void test575() { 
		assertEquals(103500, SumOfPolygonAngles.sumOfAngles(577));
	}

	@Test
	public void test576() { 
		assertEquals(103680, SumOfPolygonAngles.sumOfAngles(578));
	}

	@Test
	public void test577() { 
		assertEquals(103860, SumOfPolygonAngles.sumOfAngles(579));
	}

	@Test
	public void test578() { 
		assertEquals(104040, SumOfPolygonAngles.sumOfAngles(580));
	}

	@Test
	public void test579() { 
		assertEquals(104220, SumOfPolygonAngles.sumOfAngles(581));
	}

	@Test
	public void test580() { 
		assertEquals(104400, SumOfPolygonAngles.sumOfAngles(582));
	}

	@Test
	public void test581() { 
		assertEquals(104580, SumOfPolygonAngles.sumOfAngles(583));
	}

	@Test
	public void test582() { 
		assertEquals(104760, SumOfPolygonAngles.sumOfAngles(584));
	}

	@Test
	public void test583() { 
		assertEquals(104940, SumOfPolygonAngles.sumOfAngles(585));
	}

	@Test
	public void test584() { 
		assertEquals(105120, SumOfPolygonAngles.sumOfAngles(586));
	}

	@Test
	public void test585() { 
		assertEquals(105300, SumOfPolygonAngles.sumOfAngles(587));
	}

	@Test
	public void test586() { 
		assertEquals(105480, SumOfPolygonAngles.sumOfAngles(588));
	}

	@Test
	public void test587() { 
		assertEquals(105660, SumOfPolygonAngles.sumOfAngles(589));
	}

	@Test
	public void test588() { 
		assertEquals(105840, SumOfPolygonAngles.sumOfAngles(590));
	}

	@Test
	public void test589() { 
		assertEquals(106020, SumOfPolygonAngles.sumOfAngles(591));
	}

	@Test
	public void test590() { 
		assertEquals(106200, SumOfPolygonAngles.sumOfAngles(592));
	}

	@Test
	public void test591() { 
		assertEquals(106380, SumOfPolygonAngles.sumOfAngles(593));
	}

	@Test
	public void test592() { 
		assertEquals(106560, SumOfPolygonAngles.sumOfAngles(594));
	}

	@Test
	public void test593() { 
		assertEquals(106740, SumOfPolygonAngles.sumOfAngles(595));
	}

	@Test
	public void test594() { 
		assertEquals(106920, SumOfPolygonAngles.sumOfAngles(596));
	}

	@Test
	public void test595() { 
		assertEquals(107100, SumOfPolygonAngles.sumOfAngles(597));
	}

	@Test
	public void test596() { 
		assertEquals(107280, SumOfPolygonAngles.sumOfAngles(598));
	}

	@Test
	public void test597() { 
		assertEquals(107460, SumOfPolygonAngles.sumOfAngles(599));
	}

	@Test
	public void test598() { 
		assertEquals(107640, SumOfPolygonAngles.sumOfAngles(600));
	}

	@Test
	public void test599() { 
		assertEquals(107820, SumOfPolygonAngles.sumOfAngles(601));
	}

	@Test
	public void test600() { 
		assertEquals(108000, SumOfPolygonAngles.sumOfAngles(602));
	}

	@Test
	public void test601() { 
		assertEquals(108180, SumOfPolygonAngles.sumOfAngles(603));
	}

	@Test
	public void test602() { 
		assertEquals(108360, SumOfPolygonAngles.sumOfAngles(604));
	}

	@Test
	public void test603() { 
		assertEquals(108540, SumOfPolygonAngles.sumOfAngles(605));
	}

	@Test
	public void test604() { 
		assertEquals(108720, SumOfPolygonAngles.sumOfAngles(606));
	}

	@Test
	public void test605() { 
		assertEquals(108900, SumOfPolygonAngles.sumOfAngles(607));
	}

	@Test
	public void test606() { 
		assertEquals(109080, SumOfPolygonAngles.sumOfAngles(608));
	}

	@Test
	public void test607() { 
		assertEquals(109260, SumOfPolygonAngles.sumOfAngles(609));
	}

	@Test
	public void test608() { 
		assertEquals(109440, SumOfPolygonAngles.sumOfAngles(610));
	}

	@Test
	public void test609() { 
		assertEquals(109620, SumOfPolygonAngles.sumOfAngles(611));
	}

	@Test
	public void test610() { 
		assertEquals(109800, SumOfPolygonAngles.sumOfAngles(612));
	}

	@Test
	public void test611() { 
		assertEquals(109980, SumOfPolygonAngles.sumOfAngles(613));
	}

	@Test
	public void test612() { 
		assertEquals(110160, SumOfPolygonAngles.sumOfAngles(614));
	}

	@Test
	public void test613() { 
		assertEquals(110340, SumOfPolygonAngles.sumOfAngles(615));
	}

	@Test
	public void test614() { 
		assertEquals(110520, SumOfPolygonAngles.sumOfAngles(616));
	}

	@Test
	public void test615() { 
		assertEquals(110700, SumOfPolygonAngles.sumOfAngles(617));
	}

	@Test
	public void test616() { 
		assertEquals(110880, SumOfPolygonAngles.sumOfAngles(618));
	}

	@Test
	public void test617() { 
		assertEquals(111060, SumOfPolygonAngles.sumOfAngles(619));
	}

	@Test
	public void test618() { 
		assertEquals(111240, SumOfPolygonAngles.sumOfAngles(620));
	}

	@Test
	public void test619() { 
		assertEquals(111420, SumOfPolygonAngles.sumOfAngles(621));
	}

	@Test
	public void test620() { 
		assertEquals(111600, SumOfPolygonAngles.sumOfAngles(622));
	}

	@Test
	public void test621() { 
		assertEquals(111780, SumOfPolygonAngles.sumOfAngles(623));
	}

	@Test
	public void test622() { 
		assertEquals(111960, SumOfPolygonAngles.sumOfAngles(624));
	}

	@Test
	public void test623() { 
		assertEquals(112140, SumOfPolygonAngles.sumOfAngles(625));
	}

	@Test
	public void test624() { 
		assertEquals(112320, SumOfPolygonAngles.sumOfAngles(626));
	}

	@Test
	public void test625() { 
		assertEquals(112500, SumOfPolygonAngles.sumOfAngles(627));
	}

	@Test
	public void test626() { 
		assertEquals(112680, SumOfPolygonAngles.sumOfAngles(628));
	}

	@Test
	public void test627() { 
		assertEquals(112860, SumOfPolygonAngles.sumOfAngles(629));
	}

	@Test
	public void test628() { 
		assertEquals(113040, SumOfPolygonAngles.sumOfAngles(630));
	}

	@Test
	public void test629() { 
		assertEquals(113220, SumOfPolygonAngles.sumOfAngles(631));
	}

	@Test
	public void test630() { 
		assertEquals(113400, SumOfPolygonAngles.sumOfAngles(632));
	}

	@Test
	public void test631() { 
		assertEquals(113580, SumOfPolygonAngles.sumOfAngles(633));
	}

	@Test
	public void test632() { 
		assertEquals(113760, SumOfPolygonAngles.sumOfAngles(634));
	}

	@Test
	public void test633() { 
		assertEquals(113940, SumOfPolygonAngles.sumOfAngles(635));
	}

	@Test
	public void test634() { 
		assertEquals(114120, SumOfPolygonAngles.sumOfAngles(636));
	}

	@Test
	public void test635() { 
		assertEquals(114300, SumOfPolygonAngles.sumOfAngles(637));
	}

	@Test
	public void test636() { 
		assertEquals(114480, SumOfPolygonAngles.sumOfAngles(638));
	}

	@Test
	public void test637() { 
		assertEquals(114660, SumOfPolygonAngles.sumOfAngles(639));
	}

	@Test
	public void test638() { 
		assertEquals(114840, SumOfPolygonAngles.sumOfAngles(640));
	}

	@Test
	public void test639() { 
		assertEquals(115020, SumOfPolygonAngles.sumOfAngles(641));
	}

	@Test
	public void test640() { 
		assertEquals(115200, SumOfPolygonAngles.sumOfAngles(642));
	}

	@Test
	public void test641() { 
		assertEquals(115380, SumOfPolygonAngles.sumOfAngles(643));
	}

	@Test
	public void test642() { 
		assertEquals(115560, SumOfPolygonAngles.sumOfAngles(644));
	}

	@Test
	public void test643() { 
		assertEquals(115740, SumOfPolygonAngles.sumOfAngles(645));
	}

	@Test
	public void test644() { 
		assertEquals(115920, SumOfPolygonAngles.sumOfAngles(646));
	}

	@Test
	public void test645() { 
		assertEquals(116100, SumOfPolygonAngles.sumOfAngles(647));
	}

	@Test
	public void test646() { 
		assertEquals(116280, SumOfPolygonAngles.sumOfAngles(648));
	}

	@Test
	public void test647() { 
		assertEquals(116460, SumOfPolygonAngles.sumOfAngles(649));
	}

	@Test
	public void test648() { 
		assertEquals(116640, SumOfPolygonAngles.sumOfAngles(650));
	}

	@Test
	public void test649() { 
		assertEquals(116820, SumOfPolygonAngles.sumOfAngles(651));
	}

	@Test
	public void test650() { 
		assertEquals(117000, SumOfPolygonAngles.sumOfAngles(652));
	}

	@Test
	public void test651() { 
		assertEquals(117180, SumOfPolygonAngles.sumOfAngles(653));
	}

	@Test
	public void test652() { 
		assertEquals(117360, SumOfPolygonAngles.sumOfAngles(654));
	}

	@Test
	public void test653() { 
		assertEquals(117540, SumOfPolygonAngles.sumOfAngles(655));
	}

	@Test
	public void test654() { 
		assertEquals(117720, SumOfPolygonAngles.sumOfAngles(656));
	}

	@Test
	public void test655() { 
		assertEquals(117900, SumOfPolygonAngles.sumOfAngles(657));
	}

	@Test
	public void test656() { 
		assertEquals(118080, SumOfPolygonAngles.sumOfAngles(658));
	}

	@Test
	public void test657() { 
		assertEquals(118260, SumOfPolygonAngles.sumOfAngles(659));
	}

	@Test
	public void test658() { 
		assertEquals(118440, SumOfPolygonAngles.sumOfAngles(660));
	}

	@Test
	public void test659() { 
		assertEquals(118620, SumOfPolygonAngles.sumOfAngles(661));
	}

	@Test
	public void test660() { 
		assertEquals(118800, SumOfPolygonAngles.sumOfAngles(662));
	}

	@Test
	public void test661() { 
		assertEquals(118980, SumOfPolygonAngles.sumOfAngles(663));
	}

	@Test
	public void test662() { 
		assertEquals(119160, SumOfPolygonAngles.sumOfAngles(664));
	}

	@Test
	public void test663() { 
		assertEquals(119340, SumOfPolygonAngles.sumOfAngles(665));
	}

	@Test
	public void test664() { 
		assertEquals(119520, SumOfPolygonAngles.sumOfAngles(666));
	}

	@Test
	public void test665() { 
		assertEquals(119700, SumOfPolygonAngles.sumOfAngles(667));
	}

	@Test
	public void test666() { 
		assertEquals(119880, SumOfPolygonAngles.sumOfAngles(668));
	}

	@Test
	public void test667() { 
		assertEquals(120060, SumOfPolygonAngles.sumOfAngles(669));
	}

	@Test
	public void test668() { 
		assertEquals(120240, SumOfPolygonAngles.sumOfAngles(670));
	}

	@Test
	public void test669() { 
		assertEquals(120420, SumOfPolygonAngles.sumOfAngles(671));
	}

	@Test
	public void test670() { 
		assertEquals(120600, SumOfPolygonAngles.sumOfAngles(672));
	}

	@Test
	public void test671() { 
		assertEquals(120780, SumOfPolygonAngles.sumOfAngles(673));
	}

	@Test
	public void test672() { 
		assertEquals(120960, SumOfPolygonAngles.sumOfAngles(674));
	}

	@Test
	public void test673() { 
		assertEquals(121140, SumOfPolygonAngles.sumOfAngles(675));
	}

	@Test
	public void test674() { 
		assertEquals(121320, SumOfPolygonAngles.sumOfAngles(676));
	}

	@Test
	public void test675() { 
		assertEquals(121500, SumOfPolygonAngles.sumOfAngles(677));
	}

	@Test
	public void test676() { 
		assertEquals(121680, SumOfPolygonAngles.sumOfAngles(678));
	}

	@Test
	public void test677() { 
		assertEquals(121860, SumOfPolygonAngles.sumOfAngles(679));
	}

	@Test
	public void test678() { 
		assertEquals(122040, SumOfPolygonAngles.sumOfAngles(680));
	}

	@Test
	public void test679() { 
		assertEquals(122220, SumOfPolygonAngles.sumOfAngles(681));
	}

	@Test
	public void test680() { 
		assertEquals(122400, SumOfPolygonAngles.sumOfAngles(682));
	}

	@Test
	public void test681() { 
		assertEquals(122580, SumOfPolygonAngles.sumOfAngles(683));
	}

	@Test
	public void test682() { 
		assertEquals(122760, SumOfPolygonAngles.sumOfAngles(684));
	}

	@Test
	public void test683() { 
		assertEquals(122940, SumOfPolygonAngles.sumOfAngles(685));
	}

	@Test
	public void test684() { 
		assertEquals(123120, SumOfPolygonAngles.sumOfAngles(686));
	}

	@Test
	public void test685() { 
		assertEquals(123300, SumOfPolygonAngles.sumOfAngles(687));
	}

	@Test
	public void test686() { 
		assertEquals(123480, SumOfPolygonAngles.sumOfAngles(688));
	}

	@Test
	public void test687() { 
		assertEquals(123660, SumOfPolygonAngles.sumOfAngles(689));
	}

	@Test
	public void test688() { 
		assertEquals(123840, SumOfPolygonAngles.sumOfAngles(690));
	}

	@Test
	public void test689() { 
		assertEquals(124020, SumOfPolygonAngles.sumOfAngles(691));
	}

	@Test
	public void test690() { 
		assertEquals(124200, SumOfPolygonAngles.sumOfAngles(692));
	}

	@Test
	public void test691() { 
		assertEquals(124380, SumOfPolygonAngles.sumOfAngles(693));
	}

	@Test
	public void test692() { 
		assertEquals(124560, SumOfPolygonAngles.sumOfAngles(694));
	}

	@Test
	public void test693() { 
		assertEquals(124740, SumOfPolygonAngles.sumOfAngles(695));
	}

	@Test
	public void test694() { 
		assertEquals(124920, SumOfPolygonAngles.sumOfAngles(696));
	}

	@Test
	public void test695() { 
		assertEquals(125100, SumOfPolygonAngles.sumOfAngles(697));
	}

	@Test
	public void test696() { 
		assertEquals(125280, SumOfPolygonAngles.sumOfAngles(698));
	}

	@Test
	public void test697() { 
		assertEquals(125460, SumOfPolygonAngles.sumOfAngles(699));
	}

	@Test
	public void test698() { 
		assertEquals(125640, SumOfPolygonAngles.sumOfAngles(700));
	}

	@Test
	public void test699() { 
		assertEquals(125820, SumOfPolygonAngles.sumOfAngles(701));
	}

	@Test
	public void test700() { 
		assertEquals(126000, SumOfPolygonAngles.sumOfAngles(702));
	}

	@Test
	public void test701() { 
		assertEquals(126180, SumOfPolygonAngles.sumOfAngles(703));
	}

	@Test
	public void test702() { 
		assertEquals(126360, SumOfPolygonAngles.sumOfAngles(704));
	}

	@Test
	public void test703() { 
		assertEquals(126540, SumOfPolygonAngles.sumOfAngles(705));
	}

	@Test
	public void test704() { 
		assertEquals(126720, SumOfPolygonAngles.sumOfAngles(706));
	}

	@Test
	public void test705() { 
		assertEquals(126900, SumOfPolygonAngles.sumOfAngles(707));
	}

	@Test
	public void test706() { 
		assertEquals(127080, SumOfPolygonAngles.sumOfAngles(708));
	}

	@Test
	public void test707() { 
		assertEquals(127260, SumOfPolygonAngles.sumOfAngles(709));
	}

	@Test
	public void test708() { 
		assertEquals(127440, SumOfPolygonAngles.sumOfAngles(710));
	}

	@Test
	public void test709() { 
		assertEquals(127620, SumOfPolygonAngles.sumOfAngles(711));
	}

	@Test
	public void test710() { 
		assertEquals(127800, SumOfPolygonAngles.sumOfAngles(712));
	}

	@Test
	public void test711() { 
		assertEquals(127980, SumOfPolygonAngles.sumOfAngles(713));
	}

	@Test
	public void test712() { 
		assertEquals(128160, SumOfPolygonAngles.sumOfAngles(714));
	}

	@Test
	public void test713() { 
		assertEquals(128340, SumOfPolygonAngles.sumOfAngles(715));
	}

	@Test
	public void test714() { 
		assertEquals(128520, SumOfPolygonAngles.sumOfAngles(716));
	}

	@Test
	public void test715() { 
		assertEquals(128700, SumOfPolygonAngles.sumOfAngles(717));
	}

	@Test
	public void test716() { 
		assertEquals(128880, SumOfPolygonAngles.sumOfAngles(718));
	}

	@Test
	public void test717() { 
		assertEquals(129060, SumOfPolygonAngles.sumOfAngles(719));
	}

	@Test
	public void test718() { 
		assertEquals(129240, SumOfPolygonAngles.sumOfAngles(720));
	}

	@Test
	public void test719() { 
		assertEquals(129420, SumOfPolygonAngles.sumOfAngles(721));
	}

	@Test
	public void test720() { 
		assertEquals(129600, SumOfPolygonAngles.sumOfAngles(722));
	}

	@Test
	public void test721() { 
		assertEquals(129780, SumOfPolygonAngles.sumOfAngles(723));
	}

	@Test
	public void test722() { 
		assertEquals(129960, SumOfPolygonAngles.sumOfAngles(724));
	}

	@Test
	public void test723() { 
		assertEquals(130140, SumOfPolygonAngles.sumOfAngles(725));
	}

	@Test
	public void test724() { 
		assertEquals(130320, SumOfPolygonAngles.sumOfAngles(726));
	}

	@Test
	public void test725() { 
		assertEquals(130500, SumOfPolygonAngles.sumOfAngles(727));
	}

	@Test
	public void test726() { 
		assertEquals(130680, SumOfPolygonAngles.sumOfAngles(728));
	}

	@Test
	public void test727() { 
		assertEquals(130860, SumOfPolygonAngles.sumOfAngles(729));
	}

	@Test
	public void test728() { 
		assertEquals(131040, SumOfPolygonAngles.sumOfAngles(730));
	}

	@Test
	public void test729() { 
		assertEquals(131220, SumOfPolygonAngles.sumOfAngles(731));
	}

	@Test
	public void test730() { 
		assertEquals(131400, SumOfPolygonAngles.sumOfAngles(732));
	}

	@Test
	public void test731() { 
		assertEquals(131580, SumOfPolygonAngles.sumOfAngles(733));
	}

	@Test
	public void test732() { 
		assertEquals(131760, SumOfPolygonAngles.sumOfAngles(734));
	}

	@Test
	public void test733() { 
		assertEquals(131940, SumOfPolygonAngles.sumOfAngles(735));
	}

	@Test
	public void test734() { 
		assertEquals(132120, SumOfPolygonAngles.sumOfAngles(736));
	}

	@Test
	public void test735() { 
		assertEquals(132300, SumOfPolygonAngles.sumOfAngles(737));
	}

	@Test
	public void test736() { 
		assertEquals(132480, SumOfPolygonAngles.sumOfAngles(738));
	}

	@Test
	public void test737() { 
		assertEquals(132660, SumOfPolygonAngles.sumOfAngles(739));
	}

	@Test
	public void test738() { 
		assertEquals(132840, SumOfPolygonAngles.sumOfAngles(740));
	}

	@Test
	public void test739() { 
		assertEquals(133020, SumOfPolygonAngles.sumOfAngles(741));
	}

	@Test
	public void test740() { 
		assertEquals(133200, SumOfPolygonAngles.sumOfAngles(742));
	}

	@Test
	public void test741() { 
		assertEquals(133380, SumOfPolygonAngles.sumOfAngles(743));
	}

	@Test
	public void test742() { 
		assertEquals(133560, SumOfPolygonAngles.sumOfAngles(744));
	}

	@Test
	public void test743() { 
		assertEquals(133740, SumOfPolygonAngles.sumOfAngles(745));
	}

	@Test
	public void test744() { 
		assertEquals(133920, SumOfPolygonAngles.sumOfAngles(746));
	}

	@Test
	public void test745() { 
		assertEquals(134100, SumOfPolygonAngles.sumOfAngles(747));
	}

	@Test
	public void test746() { 
		assertEquals(134280, SumOfPolygonAngles.sumOfAngles(748));
	}

	@Test
	public void test747() { 
		assertEquals(134460, SumOfPolygonAngles.sumOfAngles(749));
	}

	@Test
	public void test748() { 
		assertEquals(134640, SumOfPolygonAngles.sumOfAngles(750));
	}

	@Test
	public void test749() { 
		assertEquals(134820, SumOfPolygonAngles.sumOfAngles(751));
	}

	@Test
	public void test750() { 
		assertEquals(135000, SumOfPolygonAngles.sumOfAngles(752));
	}

	@Test
	public void test751() { 
		assertEquals(135180, SumOfPolygonAngles.sumOfAngles(753));
	}

	@Test
	public void test752() { 
		assertEquals(135360, SumOfPolygonAngles.sumOfAngles(754));
	}

	@Test
	public void test753() { 
		assertEquals(135540, SumOfPolygonAngles.sumOfAngles(755));
	}

	@Test
	public void test754() { 
		assertEquals(135720, SumOfPolygonAngles.sumOfAngles(756));
	}

	@Test
	public void test755() { 
		assertEquals(135900, SumOfPolygonAngles.sumOfAngles(757));
	}

	@Test
	public void test756() { 
		assertEquals(136080, SumOfPolygonAngles.sumOfAngles(758));
	}

	@Test
	public void test757() { 
		assertEquals(136260, SumOfPolygonAngles.sumOfAngles(759));
	}

	@Test
	public void test758() { 
		assertEquals(136440, SumOfPolygonAngles.sumOfAngles(760));
	}

	@Test
	public void test759() { 
		assertEquals(136620, SumOfPolygonAngles.sumOfAngles(761));
	}

	@Test
	public void test760() { 
		assertEquals(136800, SumOfPolygonAngles.sumOfAngles(762));
	}

	@Test
	public void test761() { 
		assertEquals(136980, SumOfPolygonAngles.sumOfAngles(763));
	}

	@Test
	public void test762() { 
		assertEquals(137160, SumOfPolygonAngles.sumOfAngles(764));
	}

	@Test
	public void test763() { 
		assertEquals(137340, SumOfPolygonAngles.sumOfAngles(765));
	}

	@Test
	public void test764() { 
		assertEquals(137520, SumOfPolygonAngles.sumOfAngles(766));
	}

	@Test
	public void test765() { 
		assertEquals(137700, SumOfPolygonAngles.sumOfAngles(767));
	}

	@Test
	public void test766() { 
		assertEquals(137880, SumOfPolygonAngles.sumOfAngles(768));
	}

	@Test
	public void test767() { 
		assertEquals(138060, SumOfPolygonAngles.sumOfAngles(769));
	}

	@Test
	public void test768() { 
		assertEquals(138240, SumOfPolygonAngles.sumOfAngles(770));
	}

	@Test
	public void test769() { 
		assertEquals(138420, SumOfPolygonAngles.sumOfAngles(771));
	}

	@Test
	public void test770() { 
		assertEquals(138600, SumOfPolygonAngles.sumOfAngles(772));
	}

	@Test
	public void test771() { 
		assertEquals(138780, SumOfPolygonAngles.sumOfAngles(773));
	}

	@Test
	public void test772() { 
		assertEquals(138960, SumOfPolygonAngles.sumOfAngles(774));
	}

	@Test
	public void test773() { 
		assertEquals(139140, SumOfPolygonAngles.sumOfAngles(775));
	}

	@Test
	public void test774() { 
		assertEquals(139320, SumOfPolygonAngles.sumOfAngles(776));
	}

	@Test
	public void test775() { 
		assertEquals(139500, SumOfPolygonAngles.sumOfAngles(777));
	}

	@Test
	public void test776() { 
		assertEquals(139680, SumOfPolygonAngles.sumOfAngles(778));
	}

	@Test
	public void test777() { 
		assertEquals(139860, SumOfPolygonAngles.sumOfAngles(779));
	}

	@Test
	public void test778() { 
		assertEquals(140040, SumOfPolygonAngles.sumOfAngles(780));
	}

	@Test
	public void test779() { 
		assertEquals(140220, SumOfPolygonAngles.sumOfAngles(781));
	}

	@Test
	public void test780() { 
		assertEquals(140400, SumOfPolygonAngles.sumOfAngles(782));
	}

	@Test
	public void test781() { 
		assertEquals(140580, SumOfPolygonAngles.sumOfAngles(783));
	}

	@Test
	public void test782() { 
		assertEquals(140760, SumOfPolygonAngles.sumOfAngles(784));
	}

	@Test
	public void test783() { 
		assertEquals(140940, SumOfPolygonAngles.sumOfAngles(785));
	}

	@Test
	public void test784() { 
		assertEquals(141120, SumOfPolygonAngles.sumOfAngles(786));
	}

	@Test
	public void test785() { 
		assertEquals(141300, SumOfPolygonAngles.sumOfAngles(787));
	}

	@Test
	public void test786() { 
		assertEquals(141480, SumOfPolygonAngles.sumOfAngles(788));
	}

	@Test
	public void test787() { 
		assertEquals(141660, SumOfPolygonAngles.sumOfAngles(789));
	}

	@Test
	public void test788() { 
		assertEquals(141840, SumOfPolygonAngles.sumOfAngles(790));
	}

	@Test
	public void test789() { 
		assertEquals(142020, SumOfPolygonAngles.sumOfAngles(791));
	}

	@Test
	public void test790() { 
		assertEquals(142200, SumOfPolygonAngles.sumOfAngles(792));
	}

	@Test
	public void test791() { 
		assertEquals(142380, SumOfPolygonAngles.sumOfAngles(793));
	}

	@Test
	public void test792() { 
		assertEquals(142560, SumOfPolygonAngles.sumOfAngles(794));
	}

	@Test
	public void test793() { 
		assertEquals(142740, SumOfPolygonAngles.sumOfAngles(795));
	}

	@Test
	public void test794() { 
		assertEquals(142920, SumOfPolygonAngles.sumOfAngles(796));
	}

	@Test
	public void test795() { 
		assertEquals(143100, SumOfPolygonAngles.sumOfAngles(797));
	}

	@Test
	public void test796() { 
		assertEquals(143280, SumOfPolygonAngles.sumOfAngles(798));
	}

	@Test
	public void test797() { 
		assertEquals(143460, SumOfPolygonAngles.sumOfAngles(799));
	}

	@Test
	public void test798() { 
		assertEquals(143640, SumOfPolygonAngles.sumOfAngles(800));
	}

	@Test
	public void test799() { 
		assertEquals(143820, SumOfPolygonAngles.sumOfAngles(801));
	}

	@Test
	public void test800() { 
		assertEquals(144000, SumOfPolygonAngles.sumOfAngles(802));
	}

	@Test
	public void test801() { 
		assertEquals(144180, SumOfPolygonAngles.sumOfAngles(803));
	}

	@Test
	public void test802() { 
		assertEquals(144360, SumOfPolygonAngles.sumOfAngles(804));
	}

	@Test
	public void test803() { 
		assertEquals(144540, SumOfPolygonAngles.sumOfAngles(805));
	}

	@Test
	public void test804() { 
		assertEquals(144720, SumOfPolygonAngles.sumOfAngles(806));
	}

	@Test
	public void test805() { 
		assertEquals(144900, SumOfPolygonAngles.sumOfAngles(807));
	}

	@Test
	public void test806() { 
		assertEquals(145080, SumOfPolygonAngles.sumOfAngles(808));
	}

	@Test
	public void test807() { 
		assertEquals(145260, SumOfPolygonAngles.sumOfAngles(809));
	}

	@Test
	public void test808() { 
		assertEquals(145440, SumOfPolygonAngles.sumOfAngles(810));
	}

	@Test
	public void test809() { 
		assertEquals(145620, SumOfPolygonAngles.sumOfAngles(811));
	}

	@Test
	public void test810() { 
		assertEquals(145800, SumOfPolygonAngles.sumOfAngles(812));
	}

	@Test
	public void test811() { 
		assertEquals(145980, SumOfPolygonAngles.sumOfAngles(813));
	}

	@Test
	public void test812() { 
		assertEquals(146160, SumOfPolygonAngles.sumOfAngles(814));
	}

	@Test
	public void test813() { 
		assertEquals(146340, SumOfPolygonAngles.sumOfAngles(815));
	}

	@Test
	public void test814() { 
		assertEquals(146520, SumOfPolygonAngles.sumOfAngles(816));
	}

	@Test
	public void test815() { 
		assertEquals(146700, SumOfPolygonAngles.sumOfAngles(817));
	}

	@Test
	public void test816() { 
		assertEquals(146880, SumOfPolygonAngles.sumOfAngles(818));
	}

	@Test
	public void test817() { 
		assertEquals(147060, SumOfPolygonAngles.sumOfAngles(819));
	}

	@Test
	public void test818() { 
		assertEquals(147240, SumOfPolygonAngles.sumOfAngles(820));
	}

	@Test
	public void test819() { 
		assertEquals(147420, SumOfPolygonAngles.sumOfAngles(821));
	}

	@Test
	public void test820() { 
		assertEquals(147600, SumOfPolygonAngles.sumOfAngles(822));
	}

	@Test
	public void test821() { 
		assertEquals(147780, SumOfPolygonAngles.sumOfAngles(823));
	}

	@Test
	public void test822() { 
		assertEquals(147960, SumOfPolygonAngles.sumOfAngles(824));
	}

	@Test
	public void test823() { 
		assertEquals(148140, SumOfPolygonAngles.sumOfAngles(825));
	}

	@Test
	public void test824() { 
		assertEquals(148320, SumOfPolygonAngles.sumOfAngles(826));
	}

	@Test
	public void test825() { 
		assertEquals(148500, SumOfPolygonAngles.sumOfAngles(827));
	}

	@Test
	public void test826() { 
		assertEquals(148680, SumOfPolygonAngles.sumOfAngles(828));
	}

	@Test
	public void test827() { 
		assertEquals(148860, SumOfPolygonAngles.sumOfAngles(829));
	}

	@Test
	public void test828() { 
		assertEquals(149040, SumOfPolygonAngles.sumOfAngles(830));
	}

	@Test
	public void test829() { 
		assertEquals(149220, SumOfPolygonAngles.sumOfAngles(831));
	}

	@Test
	public void test830() { 
		assertEquals(149400, SumOfPolygonAngles.sumOfAngles(832));
	}

	@Test
	public void test831() { 
		assertEquals(149580, SumOfPolygonAngles.sumOfAngles(833));
	}

	@Test
	public void test832() { 
		assertEquals(149760, SumOfPolygonAngles.sumOfAngles(834));
	}

	@Test
	public void test833() { 
		assertEquals(149940, SumOfPolygonAngles.sumOfAngles(835));
	}

	@Test
	public void test834() { 
		assertEquals(150120, SumOfPolygonAngles.sumOfAngles(836));
	}

	@Test
	public void test835() { 
		assertEquals(150300, SumOfPolygonAngles.sumOfAngles(837));
	}

	@Test
	public void test836() { 
		assertEquals(150480, SumOfPolygonAngles.sumOfAngles(838));
	}

	@Test
	public void test837() { 
		assertEquals(150660, SumOfPolygonAngles.sumOfAngles(839));
	}

	@Test
	public void test838() { 
		assertEquals(150840, SumOfPolygonAngles.sumOfAngles(840));
	}

	@Test
	public void test839() { 
		assertEquals(151020, SumOfPolygonAngles.sumOfAngles(841));
	}

	@Test
	public void test840() { 
		assertEquals(151200, SumOfPolygonAngles.sumOfAngles(842));
	}

	@Test
	public void test841() { 
		assertEquals(151380, SumOfPolygonAngles.sumOfAngles(843));
	}

	@Test
	public void test842() { 
		assertEquals(151560, SumOfPolygonAngles.sumOfAngles(844));
	}

	@Test
	public void test843() { 
		assertEquals(151740, SumOfPolygonAngles.sumOfAngles(845));
	}

	@Test
	public void test844() { 
		assertEquals(151920, SumOfPolygonAngles.sumOfAngles(846));
	}

	@Test
	public void test845() { 
		assertEquals(152100, SumOfPolygonAngles.sumOfAngles(847));
	}

	@Test
	public void test846() { 
		assertEquals(152280, SumOfPolygonAngles.sumOfAngles(848));
	}

	@Test
	public void test847() { 
		assertEquals(152460, SumOfPolygonAngles.sumOfAngles(849));
	}

	@Test
	public void test848() { 
		assertEquals(152640, SumOfPolygonAngles.sumOfAngles(850));
	}

	@Test
	public void test849() { 
		assertEquals(152820, SumOfPolygonAngles.sumOfAngles(851));
	}

	@Test
	public void test850() { 
		assertEquals(153000, SumOfPolygonAngles.sumOfAngles(852));
	}

	@Test
	public void test851() { 
		assertEquals(153180, SumOfPolygonAngles.sumOfAngles(853));
	}

	@Test
	public void test852() { 
		assertEquals(153360, SumOfPolygonAngles.sumOfAngles(854));
	}

	@Test
	public void test853() { 
		assertEquals(153540, SumOfPolygonAngles.sumOfAngles(855));
	}

	@Test
	public void test854() { 
		assertEquals(153720, SumOfPolygonAngles.sumOfAngles(856));
	}

	@Test
	public void test855() { 
		assertEquals(153900, SumOfPolygonAngles.sumOfAngles(857));
	}

	@Test
	public void test856() { 
		assertEquals(154080, SumOfPolygonAngles.sumOfAngles(858));
	}

	@Test
	public void test857() { 
		assertEquals(154260, SumOfPolygonAngles.sumOfAngles(859));
	}

	@Test
	public void test858() { 
		assertEquals(154440, SumOfPolygonAngles.sumOfAngles(860));
	}

	@Test
	public void test859() { 
		assertEquals(154620, SumOfPolygonAngles.sumOfAngles(861));
	}

	@Test
	public void test860() { 
		assertEquals(154800, SumOfPolygonAngles.sumOfAngles(862));
	}

	@Test
	public void test861() { 
		assertEquals(154980, SumOfPolygonAngles.sumOfAngles(863));
	}

	@Test
	public void test862() { 
		assertEquals(155160, SumOfPolygonAngles.sumOfAngles(864));
	}

	@Test
	public void test863() { 
		assertEquals(155340, SumOfPolygonAngles.sumOfAngles(865));
	}

	@Test
	public void test864() { 
		assertEquals(155520, SumOfPolygonAngles.sumOfAngles(866));
	}

	@Test
	public void test865() { 
		assertEquals(155700, SumOfPolygonAngles.sumOfAngles(867));
	}

	@Test
	public void test866() { 
		assertEquals(155880, SumOfPolygonAngles.sumOfAngles(868));
	}

	@Test
	public void test867() { 
		assertEquals(156060, SumOfPolygonAngles.sumOfAngles(869));
	}

	@Test
	public void test868() { 
		assertEquals(156240, SumOfPolygonAngles.sumOfAngles(870));
	}

	@Test
	public void test869() { 
		assertEquals(156420, SumOfPolygonAngles.sumOfAngles(871));
	}

	@Test
	public void test870() { 
		assertEquals(156600, SumOfPolygonAngles.sumOfAngles(872));
	}

	@Test
	public void test871() { 
		assertEquals(156780, SumOfPolygonAngles.sumOfAngles(873));
	}

	@Test
	public void test872() { 
		assertEquals(156960, SumOfPolygonAngles.sumOfAngles(874));
	}

	@Test
	public void test873() { 
		assertEquals(157140, SumOfPolygonAngles.sumOfAngles(875));
	}

	@Test
	public void test874() { 
		assertEquals(157320, SumOfPolygonAngles.sumOfAngles(876));
	}

	@Test
	public void test875() { 
		assertEquals(157500, SumOfPolygonAngles.sumOfAngles(877));
	}

	@Test
	public void test876() { 
		assertEquals(157680, SumOfPolygonAngles.sumOfAngles(878));
	}

	@Test
	public void test877() { 
		assertEquals(157860, SumOfPolygonAngles.sumOfAngles(879));
	}

	@Test
	public void test878() { 
		assertEquals(158040, SumOfPolygonAngles.sumOfAngles(880));
	}

	@Test
	public void test879() { 
		assertEquals(158220, SumOfPolygonAngles.sumOfAngles(881));
	}

	@Test
	public void test880() { 
		assertEquals(158400, SumOfPolygonAngles.sumOfAngles(882));
	}

	@Test
	public void test881() { 
		assertEquals(158580, SumOfPolygonAngles.sumOfAngles(883));
	}

	@Test
	public void test882() { 
		assertEquals(158760, SumOfPolygonAngles.sumOfAngles(884));
	}

	@Test
	public void test883() { 
		assertEquals(158940, SumOfPolygonAngles.sumOfAngles(885));
	}

	@Test
	public void test884() { 
		assertEquals(159120, SumOfPolygonAngles.sumOfAngles(886));
	}

	@Test
	public void test885() { 
		assertEquals(159300, SumOfPolygonAngles.sumOfAngles(887));
	}

	@Test
	public void test886() { 
		assertEquals(159480, SumOfPolygonAngles.sumOfAngles(888));
	}

	@Test
	public void test887() { 
		assertEquals(159660, SumOfPolygonAngles.sumOfAngles(889));
	}

	@Test
	public void test888() { 
		assertEquals(159840, SumOfPolygonAngles.sumOfAngles(890));
	}

	@Test
	public void test889() { 
		assertEquals(160020, SumOfPolygonAngles.sumOfAngles(891));
	}

	@Test
	public void test890() { 
		assertEquals(160200, SumOfPolygonAngles.sumOfAngles(892));
	}

	@Test
	public void test891() { 
		assertEquals(160380, SumOfPolygonAngles.sumOfAngles(893));
	}

	@Test
	public void test892() { 
		assertEquals(160560, SumOfPolygonAngles.sumOfAngles(894));
	}

	@Test
	public void test893() { 
		assertEquals(160740, SumOfPolygonAngles.sumOfAngles(895));
	}

	@Test
	public void test894() { 
		assertEquals(160920, SumOfPolygonAngles.sumOfAngles(896));
	}

	@Test
	public void test895() { 
		assertEquals(161100, SumOfPolygonAngles.sumOfAngles(897));
	}

	@Test
	public void test896() { 
		assertEquals(161280, SumOfPolygonAngles.sumOfAngles(898));
	}

	@Test
	public void test897() { 
		assertEquals(161460, SumOfPolygonAngles.sumOfAngles(899));
	}

	@Test
	public void test898() { 
		assertEquals(161640, SumOfPolygonAngles.sumOfAngles(900));
	}

	@Test
	public void test899() { 
		assertEquals(161820, SumOfPolygonAngles.sumOfAngles(901));
	}

	@Test
	public void test900() { 
		assertEquals(162000, SumOfPolygonAngles.sumOfAngles(902));
	}

	@Test
	public void test901() { 
		assertEquals(162180, SumOfPolygonAngles.sumOfAngles(903));
	}

	@Test
	public void test902() { 
		assertEquals(162360, SumOfPolygonAngles.sumOfAngles(904));
	}

	@Test
	public void test903() { 
		assertEquals(162540, SumOfPolygonAngles.sumOfAngles(905));
	}

	@Test
	public void test904() { 
		assertEquals(162720, SumOfPolygonAngles.sumOfAngles(906));
	}

	@Test
	public void test905() { 
		assertEquals(162900, SumOfPolygonAngles.sumOfAngles(907));
	}

	@Test
	public void test906() { 
		assertEquals(163080, SumOfPolygonAngles.sumOfAngles(908));
	}

	@Test
	public void test907() { 
		assertEquals(163260, SumOfPolygonAngles.sumOfAngles(909));
	}

	@Test
	public void test908() { 
		assertEquals(163440, SumOfPolygonAngles.sumOfAngles(910));
	}

	@Test
	public void test909() { 
		assertEquals(163620, SumOfPolygonAngles.sumOfAngles(911));
	}

	@Test
	public void test910() { 
		assertEquals(163800, SumOfPolygonAngles.sumOfAngles(912));
	}

	@Test
	public void test911() { 
		assertEquals(163980, SumOfPolygonAngles.sumOfAngles(913));
	}

	@Test
	public void test912() { 
		assertEquals(164160, SumOfPolygonAngles.sumOfAngles(914));
	}

	@Test
	public void test913() { 
		assertEquals(164340, SumOfPolygonAngles.sumOfAngles(915));
	}

	@Test
	public void test914() { 
		assertEquals(164520, SumOfPolygonAngles.sumOfAngles(916));
	}

	@Test
	public void test915() { 
		assertEquals(164700, SumOfPolygonAngles.sumOfAngles(917));
	}

	@Test
	public void test916() { 
		assertEquals(164880, SumOfPolygonAngles.sumOfAngles(918));
	}

	@Test
	public void test917() { 
		assertEquals(165060, SumOfPolygonAngles.sumOfAngles(919));
	}

	@Test
	public void test918() { 
		assertEquals(165240, SumOfPolygonAngles.sumOfAngles(920));
	}

	@Test
	public void test919() { 
		assertEquals(165420, SumOfPolygonAngles.sumOfAngles(921));
	}

	@Test
	public void test920() { 
		assertEquals(165600, SumOfPolygonAngles.sumOfAngles(922));
	}

	@Test
	public void test921() { 
		assertEquals(165780, SumOfPolygonAngles.sumOfAngles(923));
	}

	@Test
	public void test922() { 
		assertEquals(165960, SumOfPolygonAngles.sumOfAngles(924));
	}

	@Test
	public void test923() { 
		assertEquals(166140, SumOfPolygonAngles.sumOfAngles(925));
	}

	@Test
	public void test924() { 
		assertEquals(166320, SumOfPolygonAngles.sumOfAngles(926));
	}

	@Test
	public void test925() { 
		assertEquals(166500, SumOfPolygonAngles.sumOfAngles(927));
	}

	@Test
	public void test926() { 
		assertEquals(166680, SumOfPolygonAngles.sumOfAngles(928));
	}

	@Test
	public void test927() { 
		assertEquals(166860, SumOfPolygonAngles.sumOfAngles(929));
	}

	@Test
	public void test928() { 
		assertEquals(167040, SumOfPolygonAngles.sumOfAngles(930));
	}

	@Test
	public void test929() { 
		assertEquals(167220, SumOfPolygonAngles.sumOfAngles(931));
	}

	@Test
	public void test930() { 
		assertEquals(167400, SumOfPolygonAngles.sumOfAngles(932));
	}

	@Test
	public void test931() { 
		assertEquals(167580, SumOfPolygonAngles.sumOfAngles(933));
	}

	@Test
	public void test932() { 
		assertEquals(167760, SumOfPolygonAngles.sumOfAngles(934));
	}

	@Test
	public void test933() { 
		assertEquals(167940, SumOfPolygonAngles.sumOfAngles(935));
	}

	@Test
	public void test934() { 
		assertEquals(168120, SumOfPolygonAngles.sumOfAngles(936));
	}

	@Test
	public void test935() { 
		assertEquals(168300, SumOfPolygonAngles.sumOfAngles(937));
	}

	@Test
	public void test936() { 
		assertEquals(168480, SumOfPolygonAngles.sumOfAngles(938));
	}

	@Test
	public void test937() { 
		assertEquals(168660, SumOfPolygonAngles.sumOfAngles(939));
	}

	@Test
	public void test938() { 
		assertEquals(168840, SumOfPolygonAngles.sumOfAngles(940));
	}

	@Test
	public void test939() { 
		assertEquals(169020, SumOfPolygonAngles.sumOfAngles(941));
	}

	@Test
	public void test940() { 
		assertEquals(169200, SumOfPolygonAngles.sumOfAngles(942));
	}

	@Test
	public void test941() { 
		assertEquals(169380, SumOfPolygonAngles.sumOfAngles(943));
	}

	@Test
	public void test942() { 
		assertEquals(169560, SumOfPolygonAngles.sumOfAngles(944));
	}

	@Test
	public void test943() { 
		assertEquals(169740, SumOfPolygonAngles.sumOfAngles(945));
	}

	@Test
	public void test944() { 
		assertEquals(169920, SumOfPolygonAngles.sumOfAngles(946));
	}

	@Test
	public void test945() { 
		assertEquals(170100, SumOfPolygonAngles.sumOfAngles(947));
	}

	@Test
	public void test946() { 
		assertEquals(170280, SumOfPolygonAngles.sumOfAngles(948));
	}

	@Test
	public void test947() { 
		assertEquals(170460, SumOfPolygonAngles.sumOfAngles(949));
	}

	@Test
	public void test948() { 
		assertEquals(170640, SumOfPolygonAngles.sumOfAngles(950));
	}

	@Test
	public void test949() { 
		assertEquals(170820, SumOfPolygonAngles.sumOfAngles(951));
	}

	@Test
	public void test950() { 
		assertEquals(171000, SumOfPolygonAngles.sumOfAngles(952));
	}

	@Test
	public void test951() { 
		assertEquals(171180, SumOfPolygonAngles.sumOfAngles(953));
	}

	@Test
	public void test952() { 
		assertEquals(171360, SumOfPolygonAngles.sumOfAngles(954));
	}

	@Test
	public void test953() { 
		assertEquals(171540, SumOfPolygonAngles.sumOfAngles(955));
	}

	@Test
	public void test954() { 
		assertEquals(171720, SumOfPolygonAngles.sumOfAngles(956));
	}

	@Test
	public void test955() { 
		assertEquals(171900, SumOfPolygonAngles.sumOfAngles(957));
	}

	@Test
	public void test956() { 
		assertEquals(172080, SumOfPolygonAngles.sumOfAngles(958));
	}

	@Test
	public void test957() { 
		assertEquals(172260, SumOfPolygonAngles.sumOfAngles(959));
	}

	@Test
	public void test958() { 
		assertEquals(172440, SumOfPolygonAngles.sumOfAngles(960));
	}

	@Test
	public void test959() { 
		assertEquals(172620, SumOfPolygonAngles.sumOfAngles(961));
	}

	@Test
	public void test960() { 
		assertEquals(172800, SumOfPolygonAngles.sumOfAngles(962));
	}

	@Test
	public void test961() { 
		assertEquals(172980, SumOfPolygonAngles.sumOfAngles(963));
	}

	@Test
	public void test962() { 
		assertEquals(173160, SumOfPolygonAngles.sumOfAngles(964));
	}

	@Test
	public void test963() { 
		assertEquals(173340, SumOfPolygonAngles.sumOfAngles(965));
	}

	@Test
	public void test964() { 
		assertEquals(173520, SumOfPolygonAngles.sumOfAngles(966));
	}

	@Test
	public void test965() { 
		assertEquals(173700, SumOfPolygonAngles.sumOfAngles(967));
	}

	@Test
	public void test966() { 
		assertEquals(173880, SumOfPolygonAngles.sumOfAngles(968));
	}

	@Test
	public void test967() { 
		assertEquals(174060, SumOfPolygonAngles.sumOfAngles(969));
	}

	@Test
	public void test968() { 
		assertEquals(174240, SumOfPolygonAngles.sumOfAngles(970));
	}

	@Test
	public void test969() { 
		assertEquals(174420, SumOfPolygonAngles.sumOfAngles(971));
	}

	@Test
	public void test970() { 
		assertEquals(174600, SumOfPolygonAngles.sumOfAngles(972));
	}

	@Test
	public void test971() { 
		assertEquals(174780, SumOfPolygonAngles.sumOfAngles(973));
	}

	@Test
	public void test972() { 
		assertEquals(174960, SumOfPolygonAngles.sumOfAngles(974));
	}

	@Test
	public void test973() { 
		assertEquals(175140, SumOfPolygonAngles.sumOfAngles(975));
	}

	@Test
	public void test974() { 
		assertEquals(175320, SumOfPolygonAngles.sumOfAngles(976));
	}

	@Test
	public void test975() { 
		assertEquals(175500, SumOfPolygonAngles.sumOfAngles(977));
	}

	@Test
	public void test976() { 
		assertEquals(175680, SumOfPolygonAngles.sumOfAngles(978));
	}

	@Test
	public void test977() { 
		assertEquals(175860, SumOfPolygonAngles.sumOfAngles(979));
	}

	@Test
	public void test978() { 
		assertEquals(176040, SumOfPolygonAngles.sumOfAngles(980));
	}

	@Test
	public void test979() { 
		assertEquals(176220, SumOfPolygonAngles.sumOfAngles(981));
	}

	@Test
	public void test980() { 
		assertEquals(176400, SumOfPolygonAngles.sumOfAngles(982));
	}

	@Test
	public void test981() { 
		assertEquals(176580, SumOfPolygonAngles.sumOfAngles(983));
	}

	@Test
	public void test982() { 
		assertEquals(176760, SumOfPolygonAngles.sumOfAngles(984));
	}

	@Test
	public void test983() { 
		assertEquals(176940, SumOfPolygonAngles.sumOfAngles(985));
	}

	@Test
	public void test984() { 
		assertEquals(177120, SumOfPolygonAngles.sumOfAngles(986));
	}

	@Test
	public void test985() { 
		assertEquals(177300, SumOfPolygonAngles.sumOfAngles(987));
	}

	@Test
	public void test986() { 
		assertEquals(177480, SumOfPolygonAngles.sumOfAngles(988));
	}

	@Test
	public void test987() { 
		assertEquals(177660, SumOfPolygonAngles.sumOfAngles(989));
	}

	@Test
	public void test988() { 
		assertEquals(177840, SumOfPolygonAngles.sumOfAngles(990));
	}

	@Test
	public void test989() { 
		assertEquals(178020, SumOfPolygonAngles.sumOfAngles(991));
	}

	@Test
	public void test990() { 
		assertEquals(178200, SumOfPolygonAngles.sumOfAngles(992));
	}

	@Test
	public void test991() { 
		assertEquals(178380, SumOfPolygonAngles.sumOfAngles(993));
	}

	@Test
	public void test992() { 
		assertEquals(178560, SumOfPolygonAngles.sumOfAngles(994));
	}

	@Test
	public void test993() { 
		assertEquals(178740, SumOfPolygonAngles.sumOfAngles(995));
	}

	@Test
	public void test994() { 
		assertEquals(178920, SumOfPolygonAngles.sumOfAngles(996));
	}

	@Test
	public void test995() { 
		assertEquals(179100, SumOfPolygonAngles.sumOfAngles(997));
	}

	@Test
	public void test996() { 
		assertEquals(179280, SumOfPolygonAngles.sumOfAngles(998));
	}

	@Test
	public void test997() { 
		assertEquals(179460, SumOfPolygonAngles.sumOfAngles(999));
	}

	@Test
	public void test998() { 
		assertEquals(179640, SumOfPolygonAngles.sumOfAngles(1000));
	}
}
