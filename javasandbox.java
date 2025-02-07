Ellipse2D.Double c = new Ellipse2D.Double(50,60,95,95);
        g2.setColor(Color.YELLOW);
        g2.fill(c);
        g2.setColor(new Color(60, 100, 220));
        g2.draw(c);

        Line2D.Double l = new Line2D.Double(0, 0, 600, 600);
        g2.setColor(Color.RED);
        g2.draw(l);

        int[] xPoints = { 150, 24, 600};
		int[] yPoints = { 150, 200, 600};
		Polygon tri = new Polygon(xPoints, yPoints, 3);
		g2.setColor(Color.RED);
        g2.fillPolygon(tri);